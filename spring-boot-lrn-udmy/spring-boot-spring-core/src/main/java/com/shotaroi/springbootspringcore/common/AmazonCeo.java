package com.shotaroi.springbootspringcore.common;

import org.springframework.stereotype.Component;

@Component
public class AmazonCeo implements Ceo {
    public AmazonCeo() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyReport() {
        return "Daily report to Jeff";
    }

}
