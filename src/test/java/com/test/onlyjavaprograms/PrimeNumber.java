package com.test.onlyjavaprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		for (int i = 3; i <= 20; i++) {
			if (isprime(i)) {
				System.out.println(" Prime : " + i);
				;
			}
		}

	}

	static boolean isprime(int n) {
		for (int i = 2; i < n; i++) {
			if ((n % i == 0)) {
				return false;
			}
		}
		return true;
	}

}
