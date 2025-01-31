package com.shotaroi.springbootspringcore.common;

import org.springframework.stereotype.Component;

@Component
public class MetaCeo implements Ceo {
    public MetaCeo() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyReport() {
        return "Daily report to Mark";
    }
}
