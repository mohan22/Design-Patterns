package com.designpattern.decorator;

public class TomatoSauce extends ToppingDecorator {
	public TomatoSauce(Pizza piz) {
		super(piz);
		System.out.println("Adding Sauce");

	}

	public String getDescription() {
		return tempPizza.getDescription() + ", Tomato Sauce";
	}

	public double getCost() {
		return tempPizza.getCost() + 0.35;
	}
}
