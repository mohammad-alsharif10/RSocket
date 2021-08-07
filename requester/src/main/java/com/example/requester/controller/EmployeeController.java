package com.example.requester.controller;


import com.example.requester.RSocket.EmployeeSocket;
import com.example.requester.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeSocket employeeSocket;

    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public Mono<Employee> getOne() {
        this.employeeSocket.connectToEmployeeSocket();
        return Mono.just(new Employee());
    }
}
