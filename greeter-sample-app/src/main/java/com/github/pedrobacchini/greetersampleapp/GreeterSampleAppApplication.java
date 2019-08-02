package com.github.pedrobacchini.greetersampleapp;

import com.github.pedrobacchini.library.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreeterSampleAppApplication implements CommandLineRunner {

    private final Greeter greeter;

    public GreeterSampleAppApplication(Greeter greeter) {this.greeter = greeter;}

    public static void main(String[] args) { SpringApplication.run(GreeterSampleAppApplication.class, args); }

    @Override
    public void run(String... args) {
        String message = greeter.greet();
        System.out.println(message);
    }

}
