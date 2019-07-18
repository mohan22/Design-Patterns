package com.designpattern.decorator;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza piz) {
		super(piz);

		System.out.println("Adding crust");

		System.out.println("Adding Mozzarella");

	}

	public String getDescription() {
		return tempPizza.getDescription() + ", Mozzarella";
	}

	public double getCost() {
		return tempPizza.getCost() + 0.50;
	}

}
