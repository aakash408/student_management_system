package com.studentapp;

public class Main {

	public static void main(String[] args) {
		System.out.println("*********** Student Management System ***********");
		System.out.println("*********** Welcome ***********");

		Student s1 = new Student("Aakash Gupta", 22, "S-21");
		s1.enrollCourse("PlayWright");
		s1.enrollCourse("Java");
		System.out.println(s1);
	}

}
