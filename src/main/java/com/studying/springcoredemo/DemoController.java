package com.studying.springcoredemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define private field for dependency injection
    private Coach coach;

    // constructor for dependency injection
    public DemoController(Coach thecoach) {
        coach = thecoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
