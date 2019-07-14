package com.designpattern.builder;

public interface StudentBuilder {
	public void buildStudentName();

	public void buildStudentRoll();

	public void buildStudentAddress();

	public Student getStudent();
}
