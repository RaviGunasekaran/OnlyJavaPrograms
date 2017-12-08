package com.online.test.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetOnlyNodeValueFromMap {

	public static void main(String[] args) {
		Map<Integer, Character> map = new HashMap<>();
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		map.put(4, 'D');

		System.out.println("INITIAL - START = " + map);

		for (int i = 0; i < map.size(); i++) {
			// System.out.println("Index = " + i);
			// System.out.println("Key = " + map.get(i+1));
		}

		int removeMe = 3;
		System.out.println("MAP - REMOVE  ");
		for (int i = 0; i < map.size(); i++) {
			System.out.println("Current Index = " + i + " && Expected Remove Index is :" + removeMe);
			System.out.println("Removed = " + map.remove(removeMe));
			break;
		}

		System.out.println("AFTER - REMOVE = " + map);

		// Get Index
		int getMe = 2;
		System.out.println("MAP - GET  ");
		for (int i = 0; i < map.size(); i++) {
			System.out.println("Current Index = " + i + " && Expected get Index is :" + getMe);
			System.out.println("GOT = " + map.get(getMe));
			break;
		}

		// System.out.println("AFTER - GET = " + map);

	}
}
