package com.penroz.springapi.wiremock.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExampleServiceTest {

    private IExampleService svc;

    @Mock
    private FriendlyExample friendlyExample;

    @BeforeEach
    void init() {
        svc = new ExampleService(friendlyExample);
    }

    @Test
    void helloTest() {
        when(friendlyExample.sayHello()).thenReturn("fake");

        final String ret = svc.hello();

        assertThat(ret).isEqualTo("fake");
    }
}