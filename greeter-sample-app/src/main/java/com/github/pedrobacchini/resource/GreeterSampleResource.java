package com.github.pedrobacchini.resource;

import com.github.pedrobacchini.library.Greeter;
import com.github.pedrobacchini.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class GreeterSampleResource {

    private final Greeter greeter;
    private final HelloService helloService;

    public GreeterSampleResource(Greeter greeter, HelloService helloService) {
        this.greeter = greeter;
        this.helloService = helloService;
    }

    @GetMapping
    public String hello() {
        helloService.sayHello();
        return greeter.greet();
    }
}
