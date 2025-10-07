
package com.studying.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// here we create a Spring Bean
@Component
@Primary // here is for primary like @Qualifier("baseballCoach") but it will be used if no other bean is qualified
@Scope("singleton")
public class CricketCoach implements Coach {

       public CricketCoach(){
        System.out.println("CricketCoach: default constructor :" + getClass().getSimpleName());
    }
     
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("CricketCoach: inside doMyStartupStuff()");
    }

    // big note here @PreDestroy only works for singleton beans (the default).
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("CricketCoach:  doMyCleanupStuff()");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your spin bowling for 11 minutes.!!!!!!!!";
    }
}
