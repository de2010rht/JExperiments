package com.imocha;

public class OuterMain {
	
	int i, j;
	
	class Inner {
		int k;
	}

	public static void main(String[] args) {
		OuterMain outerMain = new OuterMain();
		outerMain.i = 2;
		outerMain.j = 3;
		// outerMain.k = 4;		This is not allowed
		Inner inner = outerMain.new Inner();
		inner.k = 4;
		// inner.i = 5;			This is not allowed
	}

}
