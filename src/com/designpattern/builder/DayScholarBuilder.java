package com.designpattern.builder;

public class DayScholarBuilder implements StudentBuilder {

	private Student student;

	public DayScholarBuilder() {
		this.student = new DayScholar();
	}

	@Override
	public void buildStudentName() {
		student.setName("Mohan");

	}

	@Override
	public void buildStudentRoll() {
		student.setRoll("1234");

	}

	@Override
	public void buildStudentAddress() {
		student.setAddress("Hyderabad");

	}

	@Override
	public Student getStudent() {
		return student;
	}

}
