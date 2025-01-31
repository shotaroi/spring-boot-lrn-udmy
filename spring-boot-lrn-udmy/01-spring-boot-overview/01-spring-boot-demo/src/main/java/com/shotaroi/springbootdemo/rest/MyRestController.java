package com.shotaroi.springbootdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Value("${ceo.name}")
    private String ceoName;

    @Value("${company.name}")
    private String companyName;

    @GetMapping("/companyinfo")
    public String getCompanyName() {
        return "CEO: " + ceoName + ", Company name: " + companyName;
    }

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
