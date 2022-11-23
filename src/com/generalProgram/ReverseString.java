package com.generalProgram;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s ="welcome to java";  //java to welcome
		String rev="";
		
		for (int i = s.length()-1; i >=0; i--) {
            char ca = s.charAt(i);
            rev=rev+ca;
		}
		System.out.println(rev);
		
		if (s.equals(rev)) {
			System.out.println("This is a palindrome string !");
			
		} else {
			System.out.println("This is not a palindrome !");

		}
	}

}
