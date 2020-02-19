package com.qa.exercises.chickenrabbit;

public class Runner {

	public static void main(String[] args) {
		System.out.println("How many rabbits and chickens are there is there are 35 heads and 94 legs?\n" + chickensRabbits(35, 94));
		System.out.println("How many rabbits and chickens are there is there are 35 heads and 94 legs?\n" + chickensRabbits(40, 136));
	}

	public static String chickensRabbits(int h, int l) {
		int r = (l - 2 * h) / 2;
		int c = h - r;
		
		String result = ("There are " + r + " rabbits and " + c + " chickens.");
		return result;

	}

}
