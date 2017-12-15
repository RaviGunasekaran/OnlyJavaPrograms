package com.test.onlyjavaprograms;

import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author rgunasekaran
 * 
 *         COUNT THE GIVEN CHARACTERS FROM STRING & TELL WHAT IS THE CHAR COUNT
 *         OF EACH CHAR.
 * 
 *         Sample input : "abcabcc"  and Output should be a-2 b-2 c-3 so on.
 */
public class CharacterCount {

	public static void main(String[] args) {
		String string = "cabdades";
		char[] chr = string.toCharArray();
		System.out.println(chr);
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for (char c : chr) {
			if (map != null && map.size() > 0 && map.containsKey(c)) {
				int i = map.get(c);
				map.put(c, ++i);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
