package com.github.pedrobacchini.config;

import com.github.pedrobacchini.library.GreetingNameConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreeterSampleConfig {

    @Bean
    public GreetingNameConfig greetingNameConfig() {
        return new GreetingNameConfig("pedro");
    }

//    @Bean
//    public GreetingConfig greeterConfig() {
//        System.out.println("Configure Greeter");
//        String userName = "pedro";
//        String morningMessage = "Good Morning";
//        String afternoonMessage = "Good Afternoon";
//        String eveningMessage = "Good Evening";
//        String nightMessage = "Good Night";
//
//        GreetingConfig greetingConfig = new GreetingConfig();
//        greetingConfig.put(GreeterConfigParams.USER_NAME, userName);
//        greetingConfig.put(GreeterConfigParams.MORNING_MESSAGE, morningMessage);
//        greetingConfig.put(GreeterConfigParams.AFTERNOON_MESSAGE, afternoonMessage);
//        greetingConfig.put(GreeterConfigParams.EVENING_MESSAGE, eveningMessage);
//        greetingConfig.put(GreeterConfigParams.NIGHT_MESSAGE, nightMessage);
//        return greetingConfig;
//    }
}
