package com.vinsguru.lambdaexp.first;

@FunctionalInterface
public interface GreetingService {
	/**
	 * A Functional Interface can contain only one method declaration.
	 * If more than one method are declared, this annotation will throw compilation error
	 */
	void greet(String name);
}
