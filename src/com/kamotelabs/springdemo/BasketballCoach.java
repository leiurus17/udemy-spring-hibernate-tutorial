package com.kamotelabs.springdemo;

public class BasketballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	private BasketballCoach() {
	}
	
	// define a constructor for the dependency injection
	private BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Shoot ball for 30 minutes.";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
