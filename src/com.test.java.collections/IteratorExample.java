package com.test.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorExample {

	// This is Universal Iterator Example

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "RAVI1");
		map.put(2, "RAVI2");
		map.put(3, "RAVI3");

		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
