package com.vinsguru.lambdaexp.first;

public class TestGreetingService implements GreetingService {

	@Override
	public void greet(String name) {
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		GreetingService greetingService = new TestGreetingService();
		greetingService.greet("Sachin");
	}

}
