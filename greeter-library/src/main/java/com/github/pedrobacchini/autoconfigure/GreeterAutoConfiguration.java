package com.github.pedrobacchini.autoconfigure;

import com.github.pedrobacchini.library.Greeter;
import com.github.pedrobacchini.library.GreetingNameConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ConditionalOnClass(Greeter.class)
@ComponentScan("com.github.pedrobacchini")
@ConditionalOnBean(GreetingNameConfig.class)
@EnableConfigurationProperties(GreeterProperties.class)
public class GreeterAutoConfiguration {

//    @Autowired
//    private GreeterProperties greeterProperties;

//    @Bean
//    @ConditionalOnMissingBean
//    public GreetingConfig greeterConfig() {
//        System.out.println("Configure Greeter");
//        String userName = greeterProperties.getUserName() == null ? System.getProperty("user.name") : greeterProperties.getUserName();
//        String morningMessage = greeterProperties.getMorningMessage() == null ? "Good Morning" : greeterProperties.getMorningMessage();
//        String afternoonMessage = greeterProperties.getAfternoonMessage() == null ? "Good Afternoon" : greeterProperties.getAfternoonMessage();
//        String eveningMessage = greeterProperties.getEveningMessage() == null ? "Good Evening" : greeterProperties.getEveningMessage();
//        String nightMessage = greeterProperties.getNightMessage() == null ? "Good Night" : greeterProperties.getNightMessage();
//
//        GreetingConfig greetingConfig = new GreetingConfig();
//        greetingConfig.put(GreeterConfigParams.USER_NAME, userName);
//        greetingConfig.put(GreeterConfigParams.MORNING_MESSAGE, morningMessage);
//        greetingConfig.put(GreeterConfigParams.AFTERNOON_MESSAGE, afternoonMessage);
//        greetingConfig.put(GreeterConfigParams.EVENING_MESSAGE, eveningMessage);
//        greetingConfig.put(GreeterConfigParams.NIGHT_MESSAGE, nightMessage);
//        return greetingConfig;
//    }

    @Bean
    @ConditionalOnMissingBean
    public Greeter greeter(GreetingNameConfig greetingNameConfig) {
        System.out.println("Create Greeter");
        return new Greeter(greetingNameConfig);
    }

}
