package com.github.pedrobacchini;

import com.github.pedrobacchini.library.Greeter;
import com.github.pedrobacchini.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreeterSampleAppApplication implements CommandLineRunner {

    private final Greeter greeter;
    private final HelloService helloService;

    public GreeterSampleAppApplication(Greeter greeter,
                                       HelloService helloService) {
        this.greeter = greeter;
        this.helloService = helloService;
    }

    public static void main(String[] args) { SpringApplication.run(GreeterSampleAppApplication.class, args); }

    @Override
    public void run(String... args) {
        String message = greeter.greet();
        System.out.println(message);
        helloService.sayHello();
    }

}
