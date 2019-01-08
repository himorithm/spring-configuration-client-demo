package com.himanshu.configClient.configClientDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ClientController {

    @Value("${message}")
    String messageValue;

    @GetMapping(path = "/")
    public String message() {
        return messageValue+" for Spring";
    }
}
