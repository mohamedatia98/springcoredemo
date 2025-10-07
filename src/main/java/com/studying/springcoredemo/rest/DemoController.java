package com.studying.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studying.springcoredemo.common.Coach;



@RestController
public class DemoController {

          // Logs for constructor  , just to note all beans are created at startup of the application .
       public DemoController(){
        System.out.println("DemoController: default constructor :" + getClass().getSimpleName());
    }
    
    // define private field for dependency injection

    // 3- if you want to use field injection make sure to use @Autowired on the field
    // @Autowired
    private Coach coach;
        private Coach Newcoach;
/* 
    // 1- (constructor injection) for dependency injection
    // @Autowired
    public DemoController(@Qualifier("cricketCoach")Coach thecoach) {
        coach = thecoach;
    }
*/
    // 2 - (Setter injection) set function for dependency injection
    @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach thecoach , @Qualifier("cricketCoach")  Coach newcoach) {
        coach = thecoach;
        Newcoach = newcoach;
    }
    
// so using @Qualifier("baseballCoach") , will overwrite primary bean .
// this code below does check between bean scope . 
    @GetMapping("/check")
    public String getDailyWorkout() {
       // return coach.getDailyWorkout();
       return "Comparing Two Beans Now : " + coach.getDailyWorkout() + " vs " + Newcoach.getDailyWorkout() + " & " + (coach == Newcoach);
    }
/* 
    @GetMapping("/postbeans")
    public String getPostBeans() {
       return "Comparing Two Beans Now : " + coach.getPostConstruct() + " vs " + Newcoach.getPostConstruct();
    }
       */
}
