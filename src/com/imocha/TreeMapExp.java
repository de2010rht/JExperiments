package com.imocha;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExp {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(3, "Jack");
		map.put(6, "Kim");
		map.put(3, "Elon");
		map.put(7, "Fred");
		System.out.println(map);
		for (Map.Entry<Integer, String> entry : map.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());
	}

}
