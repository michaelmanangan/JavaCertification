package com.java.cerfication;

public class TestStrings {

	public static void main(String[] args) {
		String str = new String("Mike");
		System.out.println("Mike" == str );
		//above code will be false;
		str = "Mike";
		System.out.println("Mike" == str);
		//above code will be true
	}

}
