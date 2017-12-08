package com.online.test.programs;

import java.util.HashMap;

public class FindOriginalString {

	public static void main(String[] args) {
		String s = "abcde";
		HashMap<Integer, Character> stringInput = new HashMap<>();
		HashMap<Integer, Character> stringOutput = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			stringInput.put(i, s.charAt(i));
		}

		for (int i = 0; i < stringInput.size(); i++) {
			System.out.println("ITERATION - " + i);
			// After Remove
			System.out.println("Before Remove stringInput = " + stringInput);
			System.out.println("stringInput.size() == " + stringInput.size());

			// GET THE MIDDLE ELEMENT, IF SIZE IS ODD
			int len = stringInput.size();
			System.out.println("len = " + len);

			int modular = stringInput.size() % 2;
			System.out.println("modular = " + modular);

			int divided = len / 2;
			System.out.println("divided = " + divided);

			if (modular == 1 && (stringInput.size() != 1)) {
				Character obj = stringInput.get(divided);
//				Character substring1 = s.substring(divided, divided + 1).charAt(i);
//					System.out.println("SubString1 : " + substring1);
					stringOutput.put((i), obj);
					System.out.println("Added to stringOutput = " + stringOutput);
					stringInput.remove(divided);
					System.out.println("stringInput After Remove: " + stringInput);
			}
			// GET THE MIDDLE ELEMENT, IF SIZE IS EVEN
			else {
				if (modular == 0 && (stringInput.size() != 1)) {
					Character obj1 = stringInput.get(divided-1);
//					Character substring2 = s.substring(divided, divided-1).charAt(i);
//					System.out.println("SubString2 : " + substring2);
					stringOutput.put((i), obj1);
					System.out.println("Added to stringOutput = " + stringOutput);
					stringInput.remove(divided-1);
					System.out.println("stringInput After Remove: " + stringInput);
				}
			}
		}

		System.out.println("Final - Output = " + stringOutput);
	}

}
