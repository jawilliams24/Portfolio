package com.qa.exercises.fizzbuzzpopsnap;

public class Runner {

	public static void main(String[] args) {
		System.out.println("What would the result of number 21 be? " + fizzBuzzPopSnap(21));
		System.out.println("What would the result of number 1155 be? " + fizzBuzzPopSnap(1155));
	}

	static String fizzBuzzPopSnap(int num) {
		String str = "";
		StringBuilder str1 = new StringBuilder(str);
		if (num % 3 == 0) {
			str1.append("fizz");
		}
		if (num % 5 == 0) {
			str1.append("buzz");
		}
		if (num % 7 == 0) {
			str1.append("pop");
		}
		if (num % 11 == 0) {
			str1.append("snap");
		}
		return str1.toString();

	}

}
