package com.github.pedrobacchini.service;

public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("Hello from the default starter hello service");
    }
}
