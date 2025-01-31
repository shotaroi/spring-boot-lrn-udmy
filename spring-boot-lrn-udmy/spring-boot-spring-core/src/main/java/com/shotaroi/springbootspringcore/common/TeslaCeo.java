package com.shotaroi.springbootspringcore.common;
import org.springframework.stereotype.Component;

@Component
public class TeslaCeo implements Ceo {
    @Override
    public String getDailyReport() {
        return "Tesla daily report to Elon";
    }
}
