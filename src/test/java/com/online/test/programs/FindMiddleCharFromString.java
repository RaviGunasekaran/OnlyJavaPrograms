package com.online.test.programs;

import java.util.HashMap;

public class FindMiddleCharFromString {

	public static void main(String[] args) {
		String s = "abcde";
		HashMap<Integer, Character> stringInput = new HashMap<>();
		HashMap<Integer, Character> stringOutput = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			stringInput.put(i, s.charAt(i));
		}
		System.out.print("Middle String = "); 
		getMiddelLetter(s);
		System.out.println("Final - Output = " + stringOutput);
	}

	static void getMiddelLetter(String s) {
		System.out.println("Given String = " + s);
		int len = s.length();
		System.out.println("len of s = " + len);

		int divided = len / 2;
		System.out.println("divided of s = " + divided);

		int modular = len % 2;
		System.out.println("modular of s = " + modular);

		for (int i = 0; i < s.length(); i++) {
			if (modular == 1) {
				System.out.println("Your String Length is ODD. So, Pickup Middle Charator...");
				String substring1 = s.substring(divided, divided + 1);
				System.out.println("SubString1 : " + substring1);
			}
			}

			if ((s.length() % 2) == 0) {
				String substring2 = s.substring(divided - 1, divided);
				System.out.println("SubString2 : " + substring2);
			}

	}
}
