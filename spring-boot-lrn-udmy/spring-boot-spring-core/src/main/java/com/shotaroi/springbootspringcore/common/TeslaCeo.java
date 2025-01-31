package com.shotaroi.springbootspringcore.common;

import com.shotaroi.springbootspringcore.common.Ceo;
import org.springframework.stereotype.Component;

@Component
public class TeslaCeo implements Ceo {
    @Override
    public String getDailyReport() {
        return "Tesla daily report to Elon";
    }
}
