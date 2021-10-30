package com.imocha;

class Foo {
	Foo() {
		System.out.println("Object created");
	}
}

public class NumberOfObjectsCreated {

	public static void main(String[] args) {
		Foo foo = new Foo();
		foo = new Foo();
		foo = null;
		foo = new Foo();
		System.out.println(foo.hashCode());
	}

}
