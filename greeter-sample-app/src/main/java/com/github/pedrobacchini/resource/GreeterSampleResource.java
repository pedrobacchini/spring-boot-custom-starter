package com.github.pedrobacchini.resource;

import com.github.pedrobacchini.library.Greeter;
import com.github.pedrobacchini.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class GreeterSampleResource {

//    @Autowired
//    private Greeter greeter;
    @Autowired
    private HelloService helloService;

    @GetMapping
    public String hello() {
        helloService.sayHello();
//        return greeter.greet();
        return "";
    }
}
