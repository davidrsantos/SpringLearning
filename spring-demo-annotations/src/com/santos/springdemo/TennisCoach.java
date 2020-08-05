package com.santos.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

  private FortuneService fortuneService;

  /*  @Autowired
  public TennisCoach(FortuneService fortuneService) {
      this.fortuneService = fortuneService;
  }*/

  public TennisCoach() {
    System.out.println("TennisCoach: inside the default constructor");
  }

  @Autowired
  @Qualifier("randomFileFortuneService")
  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("TennisCoach: inside the setFortuneService");
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Practice your backhand volley";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  // define my init method
  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println("TennisCoach: inside of doMyStartupStuff");
  }

  // define my destroy method
  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println("TennisCoach: inside of doMyCleanupStuff");
  }
}
