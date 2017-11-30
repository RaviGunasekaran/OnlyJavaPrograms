package com.test.java.collections;

import java.util.HashMap;
import java.util.Map;

public class StudentsData {

	int id;
	String studentName;
	String studentClass;
	int subject1Mark;
	int subject2Mark;
	int subject3Mark;
	String rank;

	public HashMap<String, String> getAllData() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ID", String.valueOf(getId()));
		map.put("StudentName", getStudentName());
		map.put("StudentClass", getStudentClass());
		map.put("subject1Mark", String.valueOf(getSubject1Mark()));
		map.put("subject2Mark", String.valueOf(getSubject2Mark()));
		map.put("subject3Mark", String.valueOf(getSubject3Mark()));
		map.put("rank", getRank());
		return (HashMap<String, String>) map;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public int getSubject1Mark() {
		return subject1Mark;
	}

	public void setSubject1Mark(int subject1Mark) {
		this.subject1Mark = subject1Mark;
	}

	public int getSubject2Mark() {
		return subject2Mark;
	}

	public void setSubject2Mark(int subject2Mark) {
		this.subject2Mark = subject2Mark;
	}

	public int getSubject3Mark() {
		return subject3Mark;
	}

	public void setSubject3Mark(int subject3Mark) {
		this.subject3Mark = subject3Mark;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
