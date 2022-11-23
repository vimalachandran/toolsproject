package com.generalProgram;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWordProgram {

	public static void main(String[] args) {

		// 1.To get the String
		String s = "by the people for the people of the people";

		// 2.split the string
		String[] sp = s.split(" ");

		// 5.Map initialize
		Map<String, Integer> m = new HashMap<String, Integer>();

		// 3.foreach loop for iteration
		for (String str : sp) {
			// 7.to check the condition
			if (m.containsKey(str)) {
				Integer i = m.get(str);
				m.put(str, i + 1);

			} else {
				// 6.To add the element in the map
				m.put(str, 1);

			}

		}
		System.out.println(m);

		// 4.output structure-->by=1,the-1

	}

}
