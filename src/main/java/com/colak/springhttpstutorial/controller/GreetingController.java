package com.colak.springhttpstutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/greeting")
public class GreetingController {

    // https:/localhost:8443/api/greeting/greet
    @GetMapping("/greet")
    String greet() {
        return "Hello";
    }
}
