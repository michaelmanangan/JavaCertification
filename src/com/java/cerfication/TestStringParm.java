package com.java.cerfication;
// This means that a String is treated like a primitive when passed as a parameter
public class TestStringParm {
	
	static void passStringParm(String s) {
		s = "Michael";
		System.out.println(s);
	}
	public static void main(String[] args) {
		String s = "Bing";
		passStringParm(s);
		System.out.print(s);
	}

}
