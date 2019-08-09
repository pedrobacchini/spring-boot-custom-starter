package com.github.pedrobacchini.library;


import java.time.LocalDateTime;

import static com.github.pedrobacchini.library.GreeterConfigParams.*;

public class Greeter {

    private GreetingNameConfig greetingNameConfig;

    public Greeter(GreetingNameConfig greetingNameConfig) { this.greetingNameConfig = greetingNameConfig; }

    public String greet(LocalDateTime localDateTime) {

        String name = greetingNameConfig.getName();

//        String name = greetingConfig.getProperty(USER_NAME);
//        int hourOfDay = localDateTime.getHour();
//
//        if(hourOfDay >= 5 && hourOfDay < 12) {
//            return String.format("Hello %s, %s", name, greetingConfig.get(MORNING_MESSAGE));
//        } else if(hourOfDay >= 12 && hourOfDay < 17) {
//            return String.format("Hello %s, %s", name, greetingConfig.get(AFTERNOON_MESSAGE));
//        } else if(hourOfDay >= 17 && hourOfDay < 20) {
//            return String.format("Hello %s, %s", name, greetingConfig.get(EVENING_MESSAGE));
//        } else {
//            return String.format("Hello %s, %s", name, greetingConfig.get(NIGHT_MESSAGE));
//        }
        return name;
    }

    public String greet() { return greet(LocalDateTime.now()); }

}
