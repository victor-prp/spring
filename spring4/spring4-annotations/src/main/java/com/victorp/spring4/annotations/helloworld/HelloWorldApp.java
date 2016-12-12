package com.victorp.spring4.annotations.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author victorp
 */
public class HelloWorldApp {
    public static void main(String[] args){
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        System.out.println(helloWorld.getMessage());
    }
}


