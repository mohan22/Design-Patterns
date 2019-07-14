package com.designpattern.builder;

public class TestClass {

	public static void main(String[] args) {
		StudentBuilder dayScholar = new DayScholarBuilder();
		School school = new School(dayScholar);
		school.prepareStudent();

		Student s = school.getStudent();

		System.out.println("Student is ready!!");

		System.out.println("Student Name: " + s.getStudentName());
		System.out.println("Student Roll: " + s.getStudentRoll());
		System.out.println("Student Address: " + s.getStudentAddress());
	}

}
