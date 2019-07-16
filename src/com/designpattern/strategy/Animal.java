package com.designpattern.strategy;

public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Flys getFlyType() {
		return flyType;
	}

	public void setFlyType(Flys flyType) {
		this.flyType = flyType;
	}

	private Flys flyType;
}
