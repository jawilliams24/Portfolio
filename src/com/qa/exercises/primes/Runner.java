package com.qa.exercises.primes;

import java.util.stream.IntStream;

public class Runner {

	public static void main(String[] args) {
		System.out.println("How many prime numbers are there up to and including the number 11?\n" + (primeNumbers(11) - 2));
		System.out.println("How many prime numbers are there up to and including the number 37?\n" + (primeNumbers(37) - 2));
	}

	static int primeNumbers(int maxNum) {
		return (int) IntStream.rangeClosed(1, maxNum).filter(num -> isPrime(num)).count();
	}

	static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
