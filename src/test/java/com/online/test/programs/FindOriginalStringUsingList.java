package com.online.test.programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindOriginalStringUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		System.out.println("Given :" + s);

		List<Character> list = new LinkedList<>();
		for (int j = 0; j < s.length(); j++) {
			list.add(s.charAt(j));
		}
		for (Iterator iterator2 = list.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			int beginIndex = s.length() / 2;
			System.out.println("beginIndex = " + beginIndex);
			String c = string.substring(beginIndex, beginIndex + 1);
			System.out.println("Val = " + c);

		}

	}

}
