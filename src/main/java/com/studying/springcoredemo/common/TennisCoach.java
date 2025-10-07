package com.studying.springcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

       public TennisCoach(){
        System.out.println("TennisCoach: default constructor :" + getClass().getSimpleName());
    }


   @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("TennisCoach:  doMyStartupStuff()");
    }
    
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("TennisCoach:  doMyCleanupStuff()");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your TennisBall skills";
    }
}
