package com.shotaroi.springbootspringcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AmazonCeo implements Ceo {
    public AmazonCeo() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doWorkStuff() {
        System.out.println("In doWorkStuff(): " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanupStuff() {
        System.out.println("In doCleanupStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyReport() {
        return "Daily report to Jeff";
    }

}
