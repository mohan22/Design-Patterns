package com.designpattern.builder;

public class DayScholar implements Student {
	private String studentName;
	private String studentRoll;
	private String studentAddress;

	public String getStudentName() {
		return studentName;
	}

	public String getStudentRoll() {
		return studentRoll;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	@Override
	public void setName(String name) {
		studentName = name;

	}

	@Override
	public void setRoll(String roll) {
		studentRoll = roll;

	}

	@Override
	public void setAddress(String address) {
		studentAddress = address;
	}

}
