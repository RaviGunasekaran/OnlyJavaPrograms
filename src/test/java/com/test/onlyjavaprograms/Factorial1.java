package com.test.onlyjavaprograms;

public class Factorial1 {

	public static void main(String[] args) {
		System.out.println(fact(10));

	}

	static long fact(int n) {
		long tmp = 1;
		do {
			tmp = tmp * n;
			System.out.println("N = " + n + " AND fact = " + tmp);
			n = n - 1;
		} while (n != 1);
		return tmp;
	}
}
