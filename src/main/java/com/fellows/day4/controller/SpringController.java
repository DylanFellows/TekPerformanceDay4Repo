package com.fellows.day4.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
