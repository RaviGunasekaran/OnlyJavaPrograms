package com.test.java.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentsHashMap {

	public static void main(String[] args) {
		Map<Integer, StudentsData> map = new java.util.HashMap<Integer, StudentsData>();

		StudentsData data = new StudentsData();
		
		// SET 1ST STUDENT VALUES
		data.setId(1);
		data.setStudentName("Ravi1");
		data.setStudentClass("I");
		data.setRank("A");
		data.setSubject1Mark(75);
		data.setSubject2Mark(85);
		data.setSubject3Mark(95);
		map.put(data.getId(), data);
		System.out.println("1st Student Data Added");
		
		//GET STUDEN1 DATA
		Iterator<Entry<Integer, StudentsData>> mapitr1 = map.entrySet().iterator();
		while (mapitr1.hasNext()) {
			System.out.println("1st Student Info : " +mapitr1.next().getValue().getAllData());
			
		}
		
		// SET 2ND STUDENT VALUES
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
		Iterator<Entry<Integer, StudentsData>> mapitr2 = map.entrySet().iterator();
		while (mapitr2.hasNext()) {
			System.out.println("2nd Student Info : " +mapitr2.next().getValue().getAllData());
		}
		
		}
	}