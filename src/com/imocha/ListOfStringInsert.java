package com.imocha;

import java.util.ArrayList;
import java.util.List;

public class ListOfStringInsert {

	public static void main(String[] args) {
		List<String> arrList = new ArrayList<>();
		// arrList.add('1');	Not allowed
		// arrList.add(1);		Not allowed
		arrList.add("1");
		arrList.add(null);
	}

}
