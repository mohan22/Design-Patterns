package com.designpattern.strategy;

public class Eagle extends Animal {
	public Eagle() {
		setFlyType(new CanFly());
	}
}
