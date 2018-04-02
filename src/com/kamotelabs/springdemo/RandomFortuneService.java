package com.kamotelabs.springdemo;

public class RandomFortuneService implements FortuneService {
	
	RandomFortuneGenerator randomFortune = new RandomFortuneGenerator();
	
	@Override
	public String getFortune() {
		return randomFortune.getRandomFortune();
	}

}
