package com.studentapp;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;
	private int age;
	private String studentId;
	private List<String> courses;

	public Student(String name, int age, String studentId) {
		super();
		if (validateAge(age)) {
			this.name = name;
			this.age = age;
			this.studentId = studentId;
			courses = new ArrayList<String>(); // Initialization Of Courses !!
		}
	}

	public void enrollCourse(String course) {
		courses.add(course);
		System.out.println("Student is enrolled to " + course + " sucessfully !!!");

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + ", courses=" + courses + "]";
	}

	public void printStudentInfo() {
		System.out.println("=========== Student Information ===========");
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("Student ID: " + studentId);
		System.out.println("Enrolled For: " + courses);

	}

	// Validation Methods

	public boolean validateAge(int age) {
		if (age >= 19 && age <= 35) {
			return true;
		} else {
			System.err.println("Invalid age !!! Student age needs to be between 19 to 35");
			return false;
		}

	}
}
