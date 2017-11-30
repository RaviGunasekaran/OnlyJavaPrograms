package com.test.java.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		Map<Integer, StudentsData> map = new java.util.HashMap<Integer, StudentsData>();

		StudentsData data = new StudentsData();
		
		data.setId(1);
		data.setStudentName("Ravi1");
		data.setStudentClass("I");
		data.setRank("A");
		data.setSubject1Mark(75);
		data.setSubject2Mark(85);
		data.setSubject3Mark(95);
		map.put(data.getId(), data);
		System.out.println("1st Student Data Added");
//		System.out.println("ID = " + data.getId());
//		System.out.println("Rank = " + data.getRank());
//		System.out.println("CLASS = " + data.getStudentClass());
//		System.out.println("NAME = " + data.getStudentName());
//		System.out.println("MARK1 = " + data.getSubject1Mark());
		
		//GET STUDEN1 DATA
		Iterator<Entry<Integer, StudentsData>> i = map.entrySet().iterator();
//		Iterator<StudentsData> k = data.ge
		
		for (Iterator iterator = i; iterator.hasNext();) {
			System.out.println("ID1 = " + i.next().getValue().getId());
			System.out.println("NAME1 = " + i.next().getValue().getStudentName());
//			System.out.println("RANK = " + i.next().getValue().getRank());
		}

		data.setId(2);
		data.setStudentName("Ravi2");
		data.setStudentClass("II");
		data.setRank("A+");
		data.setSubject1Mark(92);
		data.setSubject2Mark(89);
		data.setSubject3Mark(91);
		map.put(data.getId(), data);
		System.out.println("2nd Student Data Added");

		//GET STUDEN2 DATA
		for (Iterator iterator = i; iterator.hasNext();) {
			System.out.println("ID2 = " + i.next().getValue().getId());
			System.out.println("NAME2 = " + i.next().getValue().getStudentName());
//			System.out.println("RANK = " + i.next().getValue().getRank());
		}
		//
		// System.out.println("Final map Size: " + map.size());
		// System.out.println("Final map KeySet: " + map.keySet());
		// System.out.println("Final map values: " + map.values());
		//
		// for (Map.Entry<Integer, StudentsData> entry : map.entrySet()) {
		// System.out.println("KEY = " + entry.getKey());
		// System.out.println("VALUE = " + entry.getValue().toString());
		// }
	}

}
