package com.designpattern.decorator;

public abstract class ToppingDecorator implements Pizza {

	protected Pizza tempPizza;

	public ToppingDecorator(Pizza piz) {
		tempPizza = piz;
	}

	@Override
	public String getDescription() {
		return tempPizza.getDescription();
	}

	@Override
	public double getCost() {
		return tempPizza.getCost();
	}

}
