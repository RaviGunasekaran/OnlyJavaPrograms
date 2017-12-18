package com.online.test.techgig;

import java.util.Scanner;

public class AgeConditionalProblem {

	/**
	 * 
	 * For this challenge, you need to read a integer value(default name - age) from stdin, store it in a variable and then compare that value with the conditions given below - 
    - if age is less than 10, then print 'I am happy as having no responsibilities.' to the stdout. 
    - if age is equal to or greater than 10 but less than 18, then print 'I am still happy but starts feeling pressure of life.' to the stdout. 
    - if age is equal to or greater than 18, then print 'I am very much happy as i handled the pressure very well.' to the stdout.  

	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age<10) {
			System.out.println("I am happy as having no responsibilities.");
		}
		else if ((age >=10) && (age <18)) {
			System.out.println("I am still happy but starts feeling pressure of life.");
		}
		else if(age >=18) {
			System.out.println("I am very much happy as i handled the pressure very well.");
		}

	}

}
