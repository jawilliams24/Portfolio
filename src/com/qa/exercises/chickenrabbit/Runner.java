package com.qa.exercises.chickenrabbit;

public class Runner {

	public static void main(String[] args) {
		System.out.println("There are " + r + "rabbits and " + c + "chickens.");
		chickensRabbits(35, 94);
	}

	public static int chickensRabbits(int h, int l) {
		int r = (l - 2 * h) / 2;
		int c = h - r;
		
		return r;
		return c;

	}

}
