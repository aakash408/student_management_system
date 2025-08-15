package com.studentapp;

public class Main {

	public static void main(String[] args) {
		System.out.println("*********** Student Management System ***********");
		System.out.println("*********** Welcome ***********");

		Student s1 = new Student("Aakash Gupta", 22, "S-21");
		s1.enrollCourse("AWS");
		s1.enrollCourse("Java");
		System.out.println(s1);

		Student s2 = new Student("Uday", 24, "S-11");
		s2.enrollCourse("Java");
		s2.printStudentInfo();

		Student s3 = new Student("Ritu", 26, "S-13");
		s3.enrollCourse("AWS");
		s3.printStudentInfo();
	}

}
