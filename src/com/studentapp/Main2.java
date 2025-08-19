package com.studentapp;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class Main2 {

	private static List<Student> studentList;

	public static void main(String[] args) {
		System.out.println("*********** Student Management System ***********");
		System.out.println("*********** Welcome ***********");

		studentList = new ArrayList<Student>();

		Student s1 = new Student("Aakash Gupta", 22, "S-21");
		s1.enrollCourse("AWS");
		s1.enrollCourse("Java");
		System.out.println(s1);

		Student s2 = new Student("Uday", 24, "S-11");
		s2.enrollCourse("Java");
		// s2.printStudentInfo();

		Student s3 = new Student("Ritu", 26, "S-13");
		s3.enrollCourse("AWS");
		// s3.printStudentInfo();

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		Student result = findStudentById("S-12");
		System.out.println("Result" + result);
	}

	public static Student findStudentById(String studentId) {
		Student result =  studentList.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId))
		.findFirst()
		.orElseThrow(()-> new RuntimeException("No Data Found !!!"));
		//Student result;
		return result;

	}

}
