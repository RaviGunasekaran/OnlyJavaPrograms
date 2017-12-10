package com.online.test.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class OriginalStringUsingSubString {

	public static void main(String[] args) {
		String s = "abcde";
		String s1 = "abde";
		String s2 = "ade";
		String s3 = "ae";
		String s4 = "e";

		String output = "";
		HashMap<Integer, Character> input = new HashMap<>();
		HashMap<Integer, Character> output1 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			input.put(i, s.charAt(i));
		}

		System.out.println("String = " + s);

		int len = s.length();
		System.out.println("len = " + len);

		int divided = len / 2;
		System.out.println("divided = " + divided);

		int modular = len % 2;
		System.out.println("modular = " + modular);

		for (int i = 0; i < 5; i++) {
			System.out.println("ITERATION = " + i);
			if ((s.length() % 2) == 1) {
				String substring1 = s.substring(divided, divided + 1);
				System.out.println("SubString1 : " + substring1);
				output += substring1;
				s = s.replace(substring1, "");
				System.out.println("Now S = "+s);
				substring1 = "";
			}

			if ((s.length() % 2) == 0) {
				String substring2 = s.substring(divided - 1, divided);
				System.out.println("SubString2 : " + substring2);
				output += substring2;
				s = s.replace(substring2, "");
				System.out.println("Now S = "+s);
				substring2 = "";
			}

			System.out.println("Output = " + output);

		}
	}
}
