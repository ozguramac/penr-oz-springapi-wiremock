package com.penroz.springapi.wiremock.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureWireMock
class ExampleControllerWireMockTest {

    @Autowired
    private ExampleController controller;

    @Test
    void getHelloTest() {
        assertThat(controller.getHello()).isEqualTo("Hello World!");
    }
}