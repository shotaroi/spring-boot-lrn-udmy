package com.shotaroi.springbootspringcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AmazonCeo implements Ceo {
    public AmazonCeo() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyReport() {
        return "Daily report to Jeff";
    }

}
