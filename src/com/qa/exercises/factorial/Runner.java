package com.qa.exercises.factorial;

public class Runner {

	public static void main(String[] args) {
		System.out.println("The factorial of 10 is equal to: " + factorials(10));
		System.out.println("The factorial of 6 is equal to: " + factorials(6));
	}

	public static int factorials(int i) {
		int number = 1;
		while (i > 0) {
			number = number * i;
			i--;
		}
		return number;
	}

}
