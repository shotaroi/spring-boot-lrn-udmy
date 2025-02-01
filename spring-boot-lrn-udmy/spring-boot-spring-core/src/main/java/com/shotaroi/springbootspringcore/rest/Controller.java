package com.shotaroi.springbootspringcore.rest;

import com.shotaroi.springbootspringcore.common.Ceo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Ceo ceo;
//    private Ceo anotherCeo;

    @Autowired
    public Controller(@Qualifier("amazonCeo") Ceo theCeo) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        ceo = theCeo;
    }

    @GetMapping("/dailyReport")
    public String getDailyReport() {
        return ceo.getDailyReport();
    }

//    @GetMapping("/check")
//    public String check() {
//        return "Comparing beans: ceo == anotherCeo, " + (ceo == anotherCeo);
//    }
}
