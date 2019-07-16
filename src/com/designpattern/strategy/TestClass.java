package com.designpattern.strategy;

public class TestClass {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal eagle = new Eagle();

		System.out.println(dog.getFlyType().fly());
		System.out.println(eagle.getFlyType().fly());
	}

}
