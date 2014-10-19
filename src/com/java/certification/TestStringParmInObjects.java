package com.java.certification;

public class TestStringParmInObjects {
	String name;
	
	public TestStringParmInObjects(String name) {
		this.name = name;
	}
	
	public void TestString2 (String s) {
		s = "1";
		
	}
	
	public void TestString2 (StringBuilder s) {
		StringBuilder s1 = new StringBuilder("Shaa!!"); 
		s = s1;
		//s = s.reverse();
	}
	
	public static void main(String[] args) {
		TestStringParmInObjects test = new TestStringParmInObjects("Mike");
		String s = "Bing";
		test.TestString2(s);
		System.out.println(s);
		test.TestString2(test.name);
		System.out.println(test.name);
		StringBuilder sb = new StringBuilder("Michael Jordan");
		test.TestString2(sb);
		System.out.println(sb);
		
	}

}
