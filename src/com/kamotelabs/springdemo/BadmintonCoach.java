package com.kamotelabs.springdemo;

public class BadmintonCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Smash for 30 minutes.";
	}

}
