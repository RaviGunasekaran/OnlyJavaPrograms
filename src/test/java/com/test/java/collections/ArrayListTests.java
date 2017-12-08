package com.test.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTests {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add(0, "ONE");
		list.add(000, "ZERO ZERO ZERO");
		list.add(01, "ZERO ONE");
		list.add(00, "ZERO ZERO");
		System.out.println("BEFORE REMOVE LIST = " + list);

		list.remove(000);
		System.out.println("AFTER REMOVE LIST1 = " + list);
		list.remove(000);
		System.out.println("AFTER REMOVE LIST2 = " + list);
		list.remove(000);
		System.out.println("AFTER REMOVE LIST3 = " + list);
		list.remove(000);
		System.out.println("AFTER REMOVE LIST4 = " + list);
	}

}
