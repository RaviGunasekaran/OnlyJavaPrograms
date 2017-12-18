package com.online.test.techgig;

import java.util.Scanner;

public class SimpleInterest {

	/**
	 * 
	 * Given the value of principal, interest and year. You can calculate the simple
	 * interest using the formula Sample Interest = (principal * interest *
	 * year)/100 Round the value to the nearest integer and print it.
	 * 
	 * 
	 * 'a' : principal which is of type double. 
	 * 'b' : interest which is of type integer.
	 * 'c' : year which is again of type integer.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double principal = input.nextDouble();
		int interest = input.nextInt();
		int year = input.nextInt();
		int simpleInterest = (int) ((principal * interest * year)/100);
		System.out.println(simpleInterest);
//		System.out.println(Double.doubleToLongBits(simpleInterest));
	}

}
