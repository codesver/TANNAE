package codesver.tannae.controller;

import codesver.tannae.dto.CheckAvailableDTO;
import codesver.tannae.service.VehicleFinderService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/service")
public class ServiceController {

    private final SimpMessageSendingOperations smso;
    private final VehicleFinderService finder;

    @PostMapping("/request")
    public void request(@RequestBody CheckAvailableDTO dto) {

        // 이용 가능한 차량이 있으면 차량 정보(vsn 등)을 반환하고 client 는 이를 바탕으로 STOMP 구독
    }

    @MessageMapping("/hello")
    public void message() {
        smso.convertAndSend("/sub/vehicle/1", "HELLO STOMP");
    }
}
