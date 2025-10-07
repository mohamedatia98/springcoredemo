package com.studying.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.studying.springcoredemo.common.Coach;
import com.studying.springcoredemo.common.SwimCoach;


// configuration class for Spring for third party library integration instead of bean component scanning
@Configuration
public class SportConfig {

    //@Bean
    // Or getting id for it , llike 
    @Bean("swimCoachBean")
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
