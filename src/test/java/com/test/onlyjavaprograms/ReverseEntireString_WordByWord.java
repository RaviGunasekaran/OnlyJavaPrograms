package com.test.onlyjavaprograms;

public class ReverseEntireString_WordByWord {

	public static void main(String[] args) {
		String s = "This is test";
		String[] s1 = s.split(" ");
		System.out.println(" \n REVERED :" + reverseStringArray(s1));
	}

	static String reverseStringArray(String s[]) {
		int l = s.length;
		String rev = "";
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + s[i] + " ";
		}
		return rev;
	}

}
