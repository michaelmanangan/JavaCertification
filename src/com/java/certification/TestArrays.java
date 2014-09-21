package com.java.certification;

public class TestArrays {
	public static void main(String args[]) {
		StringBuilder[] array1 = new StringBuilder[4];
		array1[0] = new StringBuilder("Bing");
		array1[1] = new StringBuilder("Matthan");
		array1[2] = new StringBuilder("Gabby");
		array1[3] = new StringBuilder("Sarah");
		
		for (StringBuilder element : array1) {
			System.out.print(element + " ");
		}
		
		StringBuilder[] arrayClone = array1.clone();
		
		for (int i = 0; i < arrayClone.length; i++) {
			System.out.println("Index i = " + i + " " + (arrayClone[i] == array1[i]) + " " );
		}
		// above proves that's cloning is a shallow copy.
		
		arrayClone[0].reverse();

		for (StringBuilder element : array1) {
			System.out.print(element + " ");
		}
		// If the arrayClone is changed, so does the array1
		
	}
}
