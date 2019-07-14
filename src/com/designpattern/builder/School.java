package com.designpattern.builder;

public class School {

	private StudentBuilder studentBuilder;

	public School(StudentBuilder studentBuilder) {
		this.studentBuilder = studentBuilder;
	}

	public Student getStudent() {
		return studentBuilder.getStudent();
	}

	public void prepareStudent() {
		studentBuilder.buildStudentAddress();
		studentBuilder.buildStudentName();
		studentBuilder.buildStudentRoll();
	}
}
