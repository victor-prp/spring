package com.victorp.spring4.annotations.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author victorp
 */
@Configuration
public class HelloConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}