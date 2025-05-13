package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach {

    // When using the @Bean annotation in the @Configuration this file would not exist, it would be a third party library imported into the Config class
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
