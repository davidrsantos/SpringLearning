package com.santos.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService TheFortuneService) {
        this.fortuneService = TheFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // add an init methond
    public void doMyStartupStuff(){
    System.out.println("TrackCoach:  inside method doMyStartupStuff");
    }

    //add a destroy methof
    public void doMyCleanupStuff(){
    System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }

}

