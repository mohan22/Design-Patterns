package com.designpattern.factory;

public class Linux implements OperatingSystem {

	@Override
	public void getFileSystem() {
		System.out.println("Linux File System");

	}

	@Override
	public void getProcessManagement() {
		System.out.println("Linux Process System");

	}

	@Override
	public void getKernal() {
		System.out.println("Linux Kernal");

	}

	@Override
	public void getDeviceManagement() {
		System.out.println("Linux Device Management");

	}

}
