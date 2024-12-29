package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/message")
    public String message(){
        return "Welcome to CI/CD";
    }


    @GetMapping("/test")
    public String testMessage(){
        return "Welcome to CI/CD Test";
    }

    @GetMapping("/retest")
    public String retestMessage(){
        return "Welcome to CI/CD reTest";
    }

}
