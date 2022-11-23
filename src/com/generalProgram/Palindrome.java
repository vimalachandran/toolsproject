package com.generalProgram;

public class Palindrome {

	public static void main(String[] args) {

		for (int i = 100; i < 10000; i++) {   //Amstrong Number

			int r, n = 141, ans = 0;
			int temp;
			temp = n;

			while (n > 0) {

				r = n % 10; 
				n = n / 10;
				ans = ans+(r*r*r) ;

			}

			if (temp == ans) {
				System.out.println(i);
			}
		}

	}

}
