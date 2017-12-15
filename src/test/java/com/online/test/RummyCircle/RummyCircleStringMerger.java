package com.online.test.RummyCircle;

public class RummyCircleStringMerger {

	public static void main(String[] args) {

		RummyCircleStringMerger obj = new RummyCircleStringMerger();
		System.out.println("MERGED = " + obj.mergeStrings("ab", "zsd"));
	}

	static String mergeStrings(String a, String b) {
		String c = "";
		char[] A = a.toCharArray();
		char[] B = b.toCharArray();

		if (a.length() == b.length()) {
			for (int i = 0; i < A.length; i++) {
				for (int j = i; j < i + 1; j++) {
					c = c + A[j] + B[j];
				}
			}
		} else if (a.length() > b.length()) {
			for (int i = 0; i < A.length; i++) {
				if (i < b.length()) {
					for (int j = i; j < i + 1; j++) {
						c = c + A[j] + B[j];
					}
				}else {
					c = c + A[i];
				}
			}
		} else if (a.length() < b.length()) {
			for (int i = 0; i < B.length; i++) {
				if (i < a.length()) {
					for (int j = i; j < i + 1; j++) {
						c = c + A[j] + B[j];
					}
				}else {
					c = c + B[i];
				}
			}
		}
		return c;

	}

}
