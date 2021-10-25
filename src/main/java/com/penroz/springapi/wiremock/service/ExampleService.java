package com.penroz.springapi.wiremock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService implements IExampleService{

    private final FriendlyExample friendlyExample;

    @Autowired
    public ExampleService(final FriendlyExample friendlyExample) {
        this.friendlyExample = friendlyExample;
    }

    @Override
    public String hello() {
        return friendlyExample.sayHello();
    }
}
