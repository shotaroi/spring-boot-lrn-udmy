package com.shotaroi.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/")
    public String greet() {
        return "Hello world!";
    }
}
