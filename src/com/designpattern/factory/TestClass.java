package com.designpattern.factory;

public class TestClass {

	public static void main(String[] args) {
		OsFactory factory = new OsFactory();
		OperatingSystem os = factory.getInstance("windows");
		os.getKernal();
	}

}
