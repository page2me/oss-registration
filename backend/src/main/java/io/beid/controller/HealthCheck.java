package io.beid.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HealthCheck {

    @GetMapping(value ="/healthcheck")
    private String get() {
        return "OK";
    }

}
