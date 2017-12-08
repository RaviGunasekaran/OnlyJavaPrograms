package com.test.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetOnlyValuesBasedOnKey {

	public static void main(String[] args) {
		System.out.println("	===		Get Only Values Based on Key	===	");

		Map<Integer, String> userData = new HashMap<Integer, String>();
		userData.put(1, "RAVI1");
		userData.put(2, "RAVI2");
		userData.put(3, "RAVI3");
		userData.put(4, "RAVI4");
		userData.put(5, "RAVI5");

		// Get Key Based on Value
		for (Entry<Integer, String> entry : userData.entrySet()) {
			if (entry.getValue().equals("RAVI3")) {
				System.out.println("Get KEY for -> Value : RAVI3 is === " + entry.getKey());
			}
		}

	}

}
