package com.shotaroi.springbootspringcore.config;

import com.shotaroi.springbootspringcore.common.Ceo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StreamConfig {
    @Bean("streaming")
    public Ceo netflixCeo() {
        return new NetflixCeo();
    }
}
