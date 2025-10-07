package com.studying.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studying.springcoredemo.common.Coach;



@RestController
public class DemoController {
    // define private field for dependency injection

    // 3- if you want to use field injection make sure to use @Autowired on the field
    // @Autowired
    private Coach coach;
/* 
    // 1- (constructor injection) for dependency injection
    // @Autowired
    public DemoController(Coach thecoach) {
        coach = thecoach;
    }
*/
    // 2 - (Setter injection) set function for dependency injection
    @Autowired
    public void setCoach(Coach thecoach) {
        coach = thecoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
