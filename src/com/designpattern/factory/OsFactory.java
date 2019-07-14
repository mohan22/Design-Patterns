package com.designpattern.factory;

public class OsFactory {
	public OperatingSystem getInstance(String param) {
		if ("windows".equals(param))
			return new Windows();
		return new Linux();
	}
}
