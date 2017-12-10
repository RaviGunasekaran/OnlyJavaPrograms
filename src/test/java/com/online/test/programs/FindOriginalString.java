package com.online.test.programs;

import java.util.HashMap;

public class FindOriginalString {
	public static void main(String[] args) {
		String s = "abcdefg";
		String s1 = "abde";
		String s2 = "ade";
		String s3 = "ae";
		String s4 = "e";

		HashMap<Integer, Character> input = new HashMap<>();
		HashMap<Integer, Character> output = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			input.put(i, s.charAt(i));
		}

		System.out.println("Given String = " + s);

		int len = s.length();
		System.out.println("len = " + len);

		int divided = len / 2;
		System.out.println("divided = " + divided);

		int modular = len % 2;
		System.out.println("modular = " + modular);

		int inputSize =input.size();
		for (int i = 0; i < inputSize; i++) {
			System.out.println("Iteration = " + i);
			System.out.println("Input Size = " + inputSize);
			if ((s.length() % 2) == 1 && (s.length()!=1)) {
				Character middleChar1 = getCharValueBasedOnGivenIndexFromGivenMap(divided, input);
				System.out.println("Middle Char1 = " + middleChar1);
				output.put(i, middleChar1);
				System.out.println("OutPut MAP = " + output);
				removeCharFromGivenIndex(divided, input);
				System.out.println("Input MAP After Removal = " + input);
			}
			
//			 if ((s.length() % 2) == 0) {
//			 String substring2 = s.substring(divided - 1, divided);
//			 System.out.println("SubString2 : " + substring2);
//			 output += substring2;
//			 }

			System.out.println("Final Output = " + output);
		}
	}

	// Remove Given Index from Given HashMap and Return HashMap
	public static void removeCharFromGivenIndex(int removeIndex, HashMap<Integer, Character> map) {
		System.out.println("RemoveIndex is = " + removeIndex);
		for (int i = 0; i < map.size(); i++) {
			System.out.println("Current Index = " + i + " && Expected Remove Index is :" + removeIndex);
			if (i == removeIndex) {
				System.out.println("Removed = " + map.remove(removeIndex));
				break;
			}
		}
	}

	// Get Index
	public static Character getCharValueBasedOnGivenIndexFromGivenMap(int index, HashMap<Integer, Character> map) {
		System.out.println("Get Index is = " + index);
		Character returnMe = null;
		for (int i = 0; i < map.size(); i++) {
			System.out.println("Current Index = " + i + " && Expected get Index is :" + index);
			System.out.println("GOT = " + map.get(index));
			returnMe = map.get(index);
			break;
		}
		return returnMe;
	}
}
