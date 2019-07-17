package com.designpattern.state;

public class HasCard implements ATMState {
	ATMMachine atmMachine;

	public HasCard(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("Can't enter more than one card");

	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected");
	}

	@Override
	public void insertPin(int pin) {
		System.out.println("Pin entered!!");
		atmMachine.setATMState(atmMachine.getHasPin());
	}

	@Override
	public void requestCash(int n) {
		System.out.println("Enter valid pin first");

	}

}
