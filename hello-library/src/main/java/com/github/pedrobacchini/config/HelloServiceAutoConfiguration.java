package com.github.pedrobacchini.config;

import com.github.pedrobacchini.service.HelloService;
import com.github.pedrobacchini.service.HelloServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloService.class)
//@ConditionalOnBean(HelloService.class)
public class HelloServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService() {
        System.out.println("Configurando Say Hello");
        return new HelloServiceImpl();
    }
}
