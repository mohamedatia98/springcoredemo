package com.studying.springcoredemo.common;

import jakarta.annotation.PostConstruct;

public class SwimCoach implements Coach {
    
    
    public SwimCoach() {
        System.out.println("SwimCoach: "+ getClass().getCanonicalName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm-up";
    }
}
