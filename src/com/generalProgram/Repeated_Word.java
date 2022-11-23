package com.generalProgram;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Repeated_Word {

	public static void main(String[] args) {

		String s = "by the people for the people of the people";

		String[] sp = s.split(" ");

		Map<String, Integer> m = new HashMap<String, Integer>();
		System.out.println(m);

		for (String str : sp) {

			if (m.containsKey(str)) {

				Integer i = m.get(str);
				m.put(str, i + 1);

			} else {

				m.put(str, 1);
			}
			//System.out.println(m);

		}
      System.out.println(m);
	}

}
