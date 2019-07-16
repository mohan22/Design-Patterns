package com.designpattern.strategy;

public class Dog extends Animal {
	public Dog() {
		setFlyType(new CanNotFly());
	}
}
