package com.generalProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		for (int i = 1000; i <10000; i++) {
		int r;
		int n=i ;
		int ans = 0;
		int temp = n;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			ans = ans+(r*r*r*r);

		}
		
		if (temp == ans) {
			System.out.println( ans+ ":-This is Amstrong Number!");
		} 
		}

	}

}
