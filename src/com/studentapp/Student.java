package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

	private String name;
	private int age;
	private String studentId;
	private List<String> courses;

	public Student(String name, int age, String studentId) {
		super();
		if (validateAge(age) && validateName(name) && validateStudentId(studentId)) {
			this.name = name;
			this.age = age;
			this.studentId = studentId;
			courses = new ArrayList<String>(); // Initialization Of Courses !!
		}
	}

//	public void enrollCourse(String course) {
//		courses.add(course);
//		System.out.println("Student is enrolled to " + course + " sucessfully !!!");
//
//	}

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

	public boolean validateName(String name) {
		String nameRegex = "^[a-zA-Z\\s]+$"; // Regex Pattern
		Pattern namePattern = Pattern.compile(nameRegex);
		Matcher nameMatcher = namePattern.matcher(name);
		if (nameMatcher.matches()) {
			return true;
		} else {
			System.err.println("Invalid Name !!! Please enter aphabets only");
			return false;
		}

	}

//	public boolean validateName(String name) {
//		if (name == null) {
//			System.err.println("Invalid Name !!! Name cannot be null");
//			return false;
//		}
//
//		String nameRegex = "^[a-zA-Z\\s]+$"; // Regex Pattern
//		Pattern namePattern = Pattern.compile(nameRegex);
//		Matcher nameMatcher = namePattern.matcher(name);
//
//		if (nameMatcher.matches()) {
//			return true;
//		} else {
//			System.err.println("Invalid Name !!! Please enter alphabets only");
//			return false;
//		}
//	}

	public boolean validateStudentId(String studentId) {
		String studentRegex = "S-\\d+$"; //
		Pattern studentIdPattern = Pattern.compile(studentRegex);
		Matcher studentIdMatcher = studentIdPattern.matcher(studentId);
		if (studentIdMatcher.matches()) {
			return true;
		} else {
			System.err.println("Invalid student ID ");
		}
		return false;

	}

	public void enrollCourse(String course) {
		if( validateCourseName(course)) {
		if (!courses.contains(course) ) {
			courses.add(course);
			System.out.println("Student is enrolled to " + course + " sucessfully !!!");
		} else {
			System.err.println("Student is already enrolled to the Course " + course);
		}

	}
}

	public boolean validateCourseName(String course) {
		if (course.equalsIgnoreCase("Java") || course.equalsIgnoreCase("QA") || course.equalsIgnoreCase("AWS")) {
			return true;

		} else {
			System.err.println("Invalid Course Name !! Please select Courses from the List !! [Java,QA,AWS]");
			return false;
		}

	}
}
