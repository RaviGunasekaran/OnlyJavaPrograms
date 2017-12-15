package com.test.onlyjavaprograms;

import java.util.Scanner;

/**
 * 
 * @author rgunasekaran
 * 
 *         THIS PROGRAM WILL PRINT ALL POSSIBLE COMBINATION OF GIVEN STRING
 *         USING RECURSIVE METHOD
 */
public class AllPossibleCombinationOfString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String: ");
		String chars = input.next();
		showPattern("", chars);

	}

	private static void showPattern(String st, String chars) {
		if (chars.length() <= 1) {
			System.out.println(st + chars);
		} else {
			for (int i = 0; i < chars.length(); i++) {
				try {
					String newString = chars.substring(0, i) + chars.substring(i + 1);
					showPattern(st + chars.charAt(i), newString);

				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

	}

}
