package com.test.JP.Interview;

public class SortOddAndEvenIntegerArray {

	public static void main(String[] args) {
		int[] s = { 3, 8, 7, 6, 5, 9, 4, 2 };

		System.out.println("====== BEFORE ASCENDING SORT ======");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
		// Sort the Given Array
		int tmp;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] > s[j]) {
					tmp = s[j];
					s[j] = s[i];
					s[i] = tmp;
				}
			}
		}
		// Print After Sort
		System.out.println("\n====== AFTER ASCENDING SORT ======");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
		// First Time Order EVEN Values
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if ((s[i] % 2) == 1) {
					tmp = s[j];
					s[j] = s[i];
					s[i] = tmp;
				}
			}
		}
		// Second Time Order ODD Values
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if ((s[i] % 2) == 1) {
					tmp = s[j];
					s[j] = s[i];
					s[i] = tmp;
				}
			}
		}

		System.out.println("\n====== FINAL ASCENDING SORT ======");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}

}
