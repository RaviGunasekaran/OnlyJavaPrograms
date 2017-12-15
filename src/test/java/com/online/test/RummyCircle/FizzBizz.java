package com.online.test.RummyCircle;

public class FizzBizz {

	public static void main(String[] args) {
		FizzBizz obj = new FizzBizz();
		obj.fizzBuzz(15);
	}

	void fizzBuzz(int n) {
		for (int i = 1; i <= n; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				if ((i % 3 == 0) && (i % 5 == 0)) {
					System.out.println("FizzBuzz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");
				}
			} else {
				System.out.println(String.valueOf(i));
			}
		}
	}
}
