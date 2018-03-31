package com.kamotelabs.springdemo;

public class BadmintonCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for the dependency injection

	@Override
	public String getDailyWorkout() {
		return "Smash for 30 minutes.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
