package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

// Create interface first to create the "contract" of what different Coach classes can do, although the methods will need to be defined individually
@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

}
