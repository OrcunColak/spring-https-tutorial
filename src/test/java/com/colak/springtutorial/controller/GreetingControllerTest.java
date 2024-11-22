package com.colak.springtutorial.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GreetingControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void greet() {
        String result = testRestTemplate.getForObject("/api/greeting/greet", String.class);

        assertNotNull(result);

        assertEquals("Hello", result);
    }

}
