package com.kamotelabs.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp2 {
	
	public static void main(String[] args) {
		
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		BasketballCoach theCoach = context.getBean("myRandomCoach", BasketballCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
