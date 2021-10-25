package com.penroz.springapi.wiremock.controller;

import com.penroz.springapi.wiremock.service.IExampleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExampleControllerTest {

    private ExampleController controller;

    @Mock
    private IExampleService svc;

    @BeforeEach
    void init() {
        controller = new ExampleController(svc);
    }

    @Test
    void getHelloTest() {
        when(svc.hello()).thenReturn("example");

        final String ret = controller.getHello();

        assertThat(ret).isEqualTo("example");
    }
}