package com.test.onlyjavaprograms;

/**
 * 
 * @author rgunasekaran
 *
 *         An Armstrong number of three digits is an integer such that the sum
 *         of the cubes of its digits is equal to the number itself. For
 *         example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
 *         Write a program to find all Armstrong number in the range of 0 and
 *         999.
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			Amstrong1(i);
		}

	}

	private static void Amstrong1(int n) {
		int tmp = n, rem, bal = 0, ams_value = 0;
		do {
			bal = n / 10;
			rem = n % 10;
			ams_value = ams_value + (rem * rem * rem);
			System.out.println("Ams Value :" + ams_value);
			n = bal;
		} while (bal != 0);
		if ((ams_value == tmp)) {
			System.out.println("Amstrong : YES : " + ams_value);
		} else
			System.out.println("Not Amstrong: " + ams_value);
	}
}
