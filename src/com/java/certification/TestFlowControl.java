package com.java.certification;

public class TestFlowControl {
	static public void main (String[] args) {
		//String str = "Michael";
		String str = new String("Michael");
		
		//switch uses the method String.equals to check equality of strings
		switch (str) {
			case "Michael": System.out.println("Michael True"); break;
			default: System.out.println("Michael Default");
		}

		String[] nameList = {"Bing", "Bong", "May"};
		outer:
		for (String outer:nameList) 
			for (String inner:nameList) {
				if (inner.equals("Bong")) {
//					break;
					break outer;
//					continue outer;
				}	
				System.out.println("outer:" + outer);
				System.out.println("inner:" + inner);
			}
		System.out.println();
		System.out.println("Finish");
		
	}
}
