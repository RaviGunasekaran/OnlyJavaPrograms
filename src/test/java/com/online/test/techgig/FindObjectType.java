package com.online.test.techgig;

import java.util.Scanner;

public class FindObjectType {

	public static void main(String[] args) {
		// Write code here
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Value = ");
		if (s.hasNextInt()) {
			System.out.println("This input is of type Integer.");
		} else if (s.hasNextFloat()) {
			System.out.println("This input is of type Float.");
		} else if (s.next() != null) {
			System.out.println("This input is of type string.");
		} else {
			System.out.println("This is something else.");
		}
	}

}
