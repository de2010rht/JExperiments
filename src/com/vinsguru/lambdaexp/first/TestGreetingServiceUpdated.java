package com.vinsguru.lambdaexp.first;

public class TestGreetingServiceUpdated {

	public static void main(String[] args) {
		GreetingService greetingService = new GreetingService() {
			
			@Override
			public void greet(String n) {
				System.out.println("Hello " + n);
			}
		};
		greetingService.greet("Sachin");
		
		GreetingService gService = (str) -> {
			System.out.println("Hi " + str);
		};
		gService.greet("Sourav");
		
		GreetingService gs = input -> System.out.println("Welcome " + input);
		gs.greet("Rahul");
		
		GreetingService greetings = System.out::println;	// Won't allow to print "Good morning Laxman"
		greetings.greet("Laxman");
	}

}
