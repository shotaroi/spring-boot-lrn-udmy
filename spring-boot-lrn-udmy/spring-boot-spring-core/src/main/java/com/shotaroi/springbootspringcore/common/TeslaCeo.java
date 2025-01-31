package com.shotaroi.springbootspringcore.common;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TeslaCeo implements Ceo {
    @Override
    public String getDailyReport() {
        return "Tesla daily report to Elon";
    }
}
