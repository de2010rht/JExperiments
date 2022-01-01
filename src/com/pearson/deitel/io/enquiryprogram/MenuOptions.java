package com.pearson.deitel.io.enquiryprogram;

public enum MenuOptions {
	ZERO_BALANCE(1),
	CREDIT_BALANCE(2),
	DEBIT_BALANCE(3),
	END(4);
	
	@SuppressWarnings("unused")
	private final int value;
	
	private MenuOptions(int val) {
		value = val;
	}
}
