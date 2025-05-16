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
    return "Hello World! The coach of the team is: " + coachName + " and the name of the team is: " + teamName;
  }
}
