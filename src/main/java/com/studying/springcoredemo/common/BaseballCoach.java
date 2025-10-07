package com.studying.springcoredemo.common;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
public class BaseballCoach implements Coach {


    public BaseballCoach(){
        System.out.println("BaseballCoach: default constructor :" + getClass().getSimpleName());
    }
    
        @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("BaseballCoach:  doMyStartupStuff()");
    }
    
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("BaseballCoach:  doMyCleanupStuff()");
    }
    

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on practice baseball";
    }
}
