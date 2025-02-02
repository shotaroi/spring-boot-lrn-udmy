package com.shotaroi.springbootspringcore.common;

public class NetflixCeo implements Ceo {
    public NetflixCeo() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyReport() {
        return "Report to Netflix CEO";
    }
}
