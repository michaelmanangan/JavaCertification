package com.java.cerfication;

public class TestStringParmInObjects {
	String name;
	
	public TestStringParmInObjects(String name) {
		this.name = name;
	}
	
	public void TestString2 (String s) {
		s = "1";
		
	}
	public static void main(String[] args) {
		TestStringParmInObjects test = new TestStringParmInObjects("Mike");
		String s = "Bing";
		test.TestString2(s);
		System.out.println(s);
		test.TestString2(test.name);
		System.out.println(test.name);
		
	}

}
