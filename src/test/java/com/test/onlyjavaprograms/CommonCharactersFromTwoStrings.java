package com.test.onlyjavaprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 * @author rgunasekaran
 *
 *         FIND COMMON CHARACTER FROM TWO STRINGS
 */
public class CommonCharactersFromTwoStrings {

	public static void main(String[] args) {

		String s1 = "I am living in india";
		String s2 = "india is a beautiful country";
		System.out.println(s1);
		System.out.println(s2);

		System.out.println("     =======         METHOD -1            =========");
		// METHOD -1
		LinkedHashSet<Character> linkedS1 = new LinkedHashSet<>();
		for (int i = 0; i < s1.length(); i++) {
			linkedS1.add(s1.charAt(i));
		}
		System.out.println(linkedS1);

		LinkedHashSet<Character> linkedS2 = new LinkedHashSet<>();
		for (int i = 0; i < s2.length(); i++) {
			linkedS2.add(s2.charAt(i));
		}
		System.out.println(linkedS2);

		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		for (Character c : linkedS1) {
			if (linkedS2.contains(c)) {
				System.out.println("Common to S1 & S2 : " + c);
			} else {
				System.out.println("Unique : " + c);
			}
		}
		
		System.out.println("     =======         METHOD -2 : TODO : PENDING            =========");
		
//		char[] c1 = s1.trim().toLowerCase().toCharArray();
//		Set<Character> c1Set = new HashSet<>();
//		for (int i = 0; i < c1.length; i++) {
//			c1Set.add(c1[i]);
//		}
//		
//		char[] c2 = s2.trim().toLowerCase().toCharArray();
//		Set<Character> c2Set = new HashSet<>();
//		for (int i = 0; i < c2.length; i++) {
//			c2Set.add(c2[i]);
//		}
//		
//		System.out.println("Result = " + (c1Set.containsAll(c2Set)));

	}

}
