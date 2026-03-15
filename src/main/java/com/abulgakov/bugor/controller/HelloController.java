package com.abulgakov.bugor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloFromBugor() {
        return "Hello from Bugor (updated)";
    }
}
