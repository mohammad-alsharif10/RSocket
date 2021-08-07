package com.example.responder.RSocket;

import com.example.responder.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.stream.Stream;

@Controller
@AllArgsConstructor
public class EmployeeSocket {

    @MessageMapping("employeeSocket")
    public Flux<Employee> sendBackFlux(String data) {
        return Flux
                .fromStream(Stream.generate(() -> new Employee("mohammad", "alsharif")))
                .delayElements(Duration.ofSeconds(1));
    }
}
