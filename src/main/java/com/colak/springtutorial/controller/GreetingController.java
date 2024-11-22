package com.colak.springtutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/greeting")
public class GreetingController {

    // https:/localhost:8080/api/greeting/greet
    @GetMapping("/greet")
    String greet() {
        return "Hello";
    }
}
