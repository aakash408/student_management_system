package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main6 {

	private static List<Student> studentList;
	private static String Scanner;

	public static void main(String[] args) {
		System.out.println("*********** Student Management System ***********");
		System.out.println("*********** Welcome ***********");

		studentList = new ArrayList<Student>();

		System.out.println("Select an Options.....");
		System.out.println("1.Register a Student ");
		System.out.println("2.Find Student with Student ID ");
		System.out.println("3.List All Student Informations ");
		System.out.println("4.List Student Information in Sorted Order ");
		System.out.println("5.Exit ");

		/*
		 * int option = Scanner.
		 * 
		 * switch (option) { case 1: enrollStudent(Scanner); break; case 2:
		 * findStudentById(Scanner); break; case 3: printAllStudentData(Scanner); break;
		 * case 4: sortByName(Scanner); break; case 5: exit(); break;
		 * 
		 * default:
		 * System.out.println("InValid Option Selected ... Enter Between 1 to 5"); }
		 

		// Read Input From the Terminal !!!
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		// If you Want to Read Input in String Format you can used next method .
		String name = scanner.next();
		System.out.println("You have Entered the name : " + name);

		// To Read Interger Value fomr the Console and Terminal
		// the readInt();

		System.out.println("Enter the Student Age ...");
		int age = scanner.nextInt(); // If you want to read the input in int format you will use nextInt();
		System.out.println("The Student Age is : " + age);

	}*/

	private static void exit() {
		// TODO Auto-generated method stub

	}

	private static void sortByName(String scanner2) {
		// TODO Auto-generated method stub

	}

	private static void printAllStudentData(String scanner2) {
		// TODO Auto-generated method stub

	}

	private static int enrollStudent(String scanner2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void enrollStudent(Scanner scanner2) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Student Name : ");
		String StudentName = scanner2.next();

		System.out.println("Enter the student age : ");
		int studentage = scanner2.nextInt();

		System.out.println("Enter the Student ID : ");
		String studentId = scanner2.next();

		Student newStudent = new Student(StudentName, studentage, studentId);
		studentList.add(newStudent);
		while (true) {

			// System.out.println("Student Added Sucessfully in LMS");

			System.out.println("Enter the Course to be enrolled :.... Type Done to Exit ");

			String coursename = scanner2.next();
			if (coursename.equalsIgnoreCase("done")) {
				break; // Exit From the Loop
			}

			newStudent.enrollCourse(coursename);
		}
		System.out.println("Enrolled to the course ...");

	}

	public static Student findStudentById(String studentId) {
		Student result = null;
		try {

			result = studentList.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId)).findFirst()
					.orElseThrow(() -> new RuntimeException("No Data Found !!!"));
		} catch (RuntimeException e) {
			System.err.println("Student with ID" + studentId + "not found");
		}
		// Student result;
		return result;

	}

	private static void sortByName() {
		Comparator<Student> studentnamecomparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
		/*
		 * {
		 * 
		 * @Override public int compare(Student o1, Student o2) { // TODO Auto-generated
		 * method stub return o1.getName().compareTo(o2.getName()); // } };
		 */

		Collections.sort(studentList, studentnamecomparator);
		System.out.println(studentList);

	}

}
