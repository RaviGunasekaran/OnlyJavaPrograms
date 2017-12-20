package com.online.test.techgig;

import java.util.Scanner;

public class FindLengthOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int cnt = 1, tmp;
		do {
			tmp = x / 10;
			cnt++;
			x= tmp;
		} while (tmp > 9);
		System.out.println(cnt);

	}

}
