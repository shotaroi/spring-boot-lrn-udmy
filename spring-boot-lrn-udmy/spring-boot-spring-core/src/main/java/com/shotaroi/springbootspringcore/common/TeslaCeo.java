package com.shotaroi.springbootspringcore.common;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TeslaCeo implements Ceo {
    public TeslaCeo() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyReport() {
        return "Tesla daily report to Elon";
    }
}
