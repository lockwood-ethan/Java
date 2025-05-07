package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FunRestController {
    // read data from application.properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${coach.team}")
    private String teamName;

    // expose a "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World! The coach of the team is: " + coachName + " The name of the team is: " + teamName;
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }
}
