package com.designpattern.strategy;

public interface Flys {
	String fly();
}

class CanFly implements Flys {
	@Override
	public String fly() {
		return "I Can Fly";
	}

}

class CanNotFly implements Flys {
	@Override
	public String fly() {
		return "I Can not Fly";
	}

}