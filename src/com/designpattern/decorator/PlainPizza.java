package com.designpattern.decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Thin Crust";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 4.00;
	}

}
