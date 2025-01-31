package com.shotaroi.springbootspringcore.common;

import org.springframework.stereotype.Component;

@Component
public class AmazonCeo implements Ceo {
    @Override
    public String getDailyReport() {
        return "Daily report to Jeff";
    }

}
