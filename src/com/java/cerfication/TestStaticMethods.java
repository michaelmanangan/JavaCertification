package com.java.cerfication;
import java.util.Scanner;

public class TestStaticMethods {
	private static Scanner userInput = new Scanner(System.in);
	private static int randomNumber = 0;

	static int createRandomNumber() {
		int num = (int) (Math.random() * 51);
		return num;
	}
	
	static int checkGuess(int num) {
		if (randomNumber == num) {
			return -1;
		} else {
			return num;
		}
	}
	
	public static void main(String[] args) {
		int guessNumber = 0;
		randomNumber = createRandomNumber();
		System.out.println("Random number to guess is " + randomNumber);
		while (guessNumber != -1) {
			System.out.print("Guess the number between 0 to 50: " );
			guessNumber = checkGuess(userInput.nextInt());
		}
		System.out.println("Yes random number is " + randomNumber);
		
	}
}
