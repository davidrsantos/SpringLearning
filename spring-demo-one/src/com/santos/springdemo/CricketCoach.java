package com.santos.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    //create a no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach:  inside no-arg constructor");
    }

    public void setFortuneService(FortuneService theFortuneService) {

        System.out.println("CricKetCoach: inside setter method - setFortuneService");
        this.fortuneService = theFortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricKetCoach: inside setter method - setEmailAddress");

        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricKetCoach: inside setter method - setTeam");

        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
