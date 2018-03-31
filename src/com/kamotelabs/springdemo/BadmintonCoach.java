package com.kamotelabs.springdemo;

public class BadmintonCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;

	public BadmintonCoach() {
	}
	
	// define a constructor for the dependency injection
	private BadmintonCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Smash for 30 minutes.";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
