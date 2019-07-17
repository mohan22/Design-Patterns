package com.designpattern.state;

public class HasPin implements ATMState {
	ATMMachine atmMachine;

	public HasPin(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("Can not insert multiple cards");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected!!");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pin) {
		System.out.println("Pin entered already");

	}

	@Override
	public void requestCash(int n) {
		if (atmMachine.cashInMachine >= n) {
			System.out.println("Cash dispensed : " + n);
			atmMachine.cashInMachine -= n;
			atmMachine.setATMState(atmMachine.getNoCardState());
		} else {
			System.out.println("No Cash!!! Ejecting card");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}

	}

}
