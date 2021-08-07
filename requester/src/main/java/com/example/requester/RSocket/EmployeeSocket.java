package com.example.requester.RSocket;

import com.example.requester.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeSocket {

    private final RSocketRequester rSocketRequester;

    public void connectToEmployeeSocket() {
        this.rSocketRequester
                .route("employeeSocket")
                .data("open")
                .retrieveFlux(Employee.class)
                .subscribe(System.out::println);
    }
}
