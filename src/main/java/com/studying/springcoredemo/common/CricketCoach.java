
package com.studying.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// here we create a Spring Bean
@Component
@Primary // here is for primary like @Qualifier("baseballCoach") but it will be used if no other bean is qualified
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your spin bowling for 11 minutes.!!!!!!!!";
    }
}
