package com.java.cerfication;

public class TestStringMethods {

	public static void main(String[] args) {
		String str1 = new String("Mike");
		String str2 = "Mike";
		System.out.println(str1 == str2);
		str1 = "Bing";
		System.out.println(str1 == "Bing");
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(0) == 'B');
		str1 = "BAB";
		System.out.println(str1.indexOf('B'));
		//indexOf method returns -1 if char is not found.
		System.out.println(str1.indexOf('B',1));
		str1 = "BABAB";
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(2,5));
		// for the 2 int parm option, the end index is not included.
		
	}

}
