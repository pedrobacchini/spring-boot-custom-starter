package com.github.pedrobacchini.greetersampleapp;

import com.github.pedrobacchini.library.Greeter;
import com.github.pedrobacchini.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreeterSampleAppApplication implements CommandLineRunner {

    @Autowired
    private Greeter greeter;
    @Autowired
    private HelloService helloService;

    public static void main(String[] args) { SpringApplication.run(GreeterSampleAppApplication.class, args); }

    @Override
    public void run(String... args) {
        String message = greeter.greet();
        System.out.println(message);
        helloService.sayHello();
    }

}
