
package com.studying.springcoredemo.common;

import org.springframework.stereotype.Component;

// here we create a Spring Bean
@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your spin bowling for 30 minutes.!!!!!!!!";
    }
}
