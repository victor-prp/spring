package com.victorp.spring4.annotations.helloworld;


import org.springframework.context.annotation.*;



/**
 * @author victorp
 */
public class HelloWorld {

    private String message = "I have new message to this strange world";
    public HelloWorld() {
        System.out.println("HelloWorld is created");
    }

    public String getMessage() {
        return message;
    }
}
