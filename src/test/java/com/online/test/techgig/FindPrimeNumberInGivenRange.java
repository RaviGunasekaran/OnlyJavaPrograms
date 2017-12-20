package com.online.test.techgig;

import java.util.Scanner;

public class FindPrimeNumberInGivenRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Start : ");
		int start = scanner.nextInt();
		System.out.println("Enter End : ");
		int end = scanner.nextInt();
		int cnt = 0;
		for (int i = start; i < end; i++) {
			if (isprime(i)) {
					cnt++;
				System.out.println(" Prime : " + i);
			}
		}
		System.out.println("Count is = " + cnt);
		// System.out.println(cnt);

	}

	static boolean isprime(int n) {
		if((n ==1) )
			return false;
		for (int i = 2; i < n; i++) {
			if ((n % i == 0)) {
				return false;
			}
		}
		return true;
	}
}
