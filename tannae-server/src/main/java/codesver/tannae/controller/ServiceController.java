package codesver.tannae.controller;

import codesver.tannae.domain.FlagWith;
import codesver.tannae.domain.Process;
import codesver.tannae.dto.ServiceRequestDTO;
import codesver.tannae.dto.ServiceResponseDTO;
import codesver.tannae.service.RequestProcessor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/service")
public class ServiceController {

    private final SimpMessageSendingOperations smso;
    private final RequestProcessor processor;

    @PostMapping("/request")
    public ServiceResponseDTO request(@RequestBody ServiceRequestDTO requestDTO) {
        log.info("[CONTROLLER-SERVICE : REQUEST] /service/request body={}", requestDTO);
        FlagWith<Process> process = processor.processRequest(requestDTO);
        ServiceResponseDTO response = new ServiceResponseDTO();
        response.setFlag(process.getFlag());
        response.setProcess(process.get());
        return response;
    }

    @MessageMapping("/hello")
    public void message() {
        smso.convertAndSend("/sub/vehicle/1", "HELLO STOMP");
    }
}
