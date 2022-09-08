package codesver.tannae.controller;

import codesver.tannae.domain.DRO;
import codesver.tannae.domain.Process;
import codesver.tannae.dto.ServiceRequestDTO;
import codesver.tannae.dto.ServiceResponseDTO;
import codesver.tannae.repository.process.ProcessRepository;
import codesver.tannae.service.RequestHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/service")
public class ServiceController {

    private final SimpMessageSendingOperations smso;
    private final RequestHandler processor;

    private final ProcessRepository processRepository;

    @PostMapping("/request")
    public ServiceResponseDTO request(@RequestBody ServiceRequestDTO requestDTO) {
        log.info("[CONTROLLER-SERVICE {} : REQUEST ] /service/request body={}", Thread.currentThread().getId(), requestDTO);
        DRO<Process> dro = processor.handleRequest(requestDTO);
        Process process = dro.get();
        return dro.getFlag() > 0 ? new ServiceResponseDTO(dro.getFlag(), process.getVehicle().getVsn(), requestDTO.getUsn(),
                process.getPath(), dro.getGuider().toString(), process.getPassed())
                : new ServiceResponseDTO(dro.getFlag());
    }

    @MessageMapping("/connect")
    public void connect(@Payload String id) {
        log.info("[SOCKET-CONTROLLER-SERVICE {} : CONNECT] User {} is connected to STOMP", Thread.currentThread().getId(), id);
    }

    @MessageMapping("/request")
    public void request(@Payload String payload) {
        log.info("[SOCKET-CONTROLLER-SERVICE {} : REQUEST] Request={}", Thread.currentThread().getId(), payload);
        JSONObject message = new JSONObject(payload);
        smso.convertAndSend("/sub/vehicle/" + message.getInt("vsn"), message.toString());
    }

    @MessageMapping("/transfer")
    public void transfer(@Payload String vsns) {
        log.info("[SOCKET-CONTROLLER-SERVICE {} : TRANSFER] Transfer vehicle {} to next point", Thread.currentThread().getId(), vsns);
        int vsn = Integer.parseInt(vsns);
        Optional<Process> optionalProcess = processRepository.increasePassed(vsn);
        Process process = optionalProcess.get();
        JSONArray path = new JSONArray(process.getPath());
        JSONObject data = new JSONObject();
        Integer passed = process.getPassed();

        if (passed + 1 == path.length()) {

        } else {

        }
    }
}
