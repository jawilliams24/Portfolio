package com.qa.exercises.find;
public class Runner {

	public static void main(String[] args) {
		System.out.println("is char 'p' in string 'public' at position '3': " + find("public", 1, 'p'));
		System.out.println("is char 'j' in string 'factorial' at position '5': " + find("factorial", 5, 'j'));

	}
	
	public static boolean find(String s, int i, char c) {
		return s.charAt(i-1) == c;
	}
}
