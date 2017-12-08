package com.test.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveOneEntryBasedOnKey {

	public static void main(String[] args) {
		System.out.println("	===		Remove One Entry Value Based on Key	===	");

		Map<Integer, String> userData = new HashMap<Integer, String>();
		userData.put(1, "RAVI1");
		userData.put(2, "RAVI2");
		userData.put(3, "RAVI3");
		userData.put(4, "RAVI4");
		userData.put(5, "RAVI5");

		// Before Remove
		System.out.println("Before Remove = " + userData);

		int yourValue = 6;
		for (Entry<Integer, String> entrySet : userData.entrySet()) {
			int myKeyIntValue = entrySet.getKey().intValue();
			System.out.println("myKeyIntValue = " + myKeyIntValue);
			if (myKeyIntValue == yourValue) {
				userData.remove(myKeyIntValue);
				break;
			}

		}

		// After Remove
		System.out.println("After Remove = " + userData);

	}

}
