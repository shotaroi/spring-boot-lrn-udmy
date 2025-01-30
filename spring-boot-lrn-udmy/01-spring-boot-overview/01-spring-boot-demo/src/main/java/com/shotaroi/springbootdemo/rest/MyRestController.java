package com.shotaroi.springbootdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/")
    public String greet() {
        return "Hello world!";
    }

    @GetMapping("/study")
    public String getStudyDetail() {
        return "Study programming";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Super lucky today";
    }

}
