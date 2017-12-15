package com.test.JP.Interview;

import java.util.LinkedList;

public class NthElementInLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<>();
		for (int i = 1; i < 101; i++) {
			link.add(i);
		}
		System.out.println("1 to 100 added = " + link);
		
		for (int i = link.size(); i >97 ; i--) {
			System.out.println("97th Element : "+ link.descendingIterator().next());
		}

	}

}
