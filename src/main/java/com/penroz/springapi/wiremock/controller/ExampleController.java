package com.penroz.springapi.wiremock.controller;

import com.penroz.springapi.wiremock.service.IExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExampleController {

    private final IExampleService svc;

    @Autowired
    public ExampleController(final IExampleService svc) {
        this.svc = svc;
    }

    @GetMapping
    public String getHello() {
        return svc.hello();
    }
}
