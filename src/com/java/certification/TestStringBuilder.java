package com.java.certification;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder(str1);
		StringBuilder str3 = new StringBuilder(50);
		StringBuilder str4 = new StringBuilder("Michael");
		System.out.println(str1 + " " + str2 + " " + str3 + " " + str4);
		str1.append("Bing");
		System.out.println(str1 + " " + str1.length() + " " + str4);
		
	}

}
