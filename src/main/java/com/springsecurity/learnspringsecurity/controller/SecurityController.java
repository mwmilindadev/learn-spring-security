package com.springsecurity.learnspringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @GetMapping("/Hello-World")
    public String getDetails(){
        return "Hello World";
    }
}
