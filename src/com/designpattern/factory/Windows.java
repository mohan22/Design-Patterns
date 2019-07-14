package com.designpattern.factory;

public class Windows implements OperatingSystem {

	@Override
	public void getFileSystem() {
		System.out.println("Windows File System");

	}

	@Override
	public void getProcessManagement() {
		System.out.println("Windows Process System");

	}

	@Override
	public void getKernal() {
		System.out.println("Windows Kernal");

	}

	@Override
	public void getDeviceManagement() {
		System.out.println("Windows Device Management");

	}

}
