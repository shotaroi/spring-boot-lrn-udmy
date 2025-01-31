package com.shotaroi.springbootspringcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Ceo ceo;

    @Autowired
    public Controller(Ceo theCeo) {
        ceo = theCeo;
    }

    @GetMapping("/dailyReport")
    public String getDailyReport() {
        return ceo.getDailyReport();
    }
}
