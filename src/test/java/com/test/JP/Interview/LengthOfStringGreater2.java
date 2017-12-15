package com.test.JP.Interview;

public class LengthOfStringGreater2 {

	public static void main(String[] args) {
		String s = "ABCDEFG";
		System.out.println("Length : " + s.length());
		
		//Print SubString where Len > 2
		for (int i = 3; i < s.length(); i++) {
			System.out.println(s.substring(0, i));
		}
	}

}
