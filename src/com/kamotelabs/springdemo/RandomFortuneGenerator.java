package com.kamotelabs.springdemo;

import java.util.ArrayList;
import java.util.Random;

public class RandomFortuneGenerator {
	
	public String getRandomFortune() {
		
		Random random = new Random();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Today it's up to you to create the peacefulness you long for.");
		list.add("A friend asks only for your time not your money.");
		list.add("You will marry your lover.");
		list.add("It's amazing how much good you can do if you don't care who gets the credit.");
		
		return list.get(random.nextInt(list.size()));
	}

}
