package com.designpattern.state;

public class NoCash implements ATMState {
	ATMMachine atmMachine;

	public NoCash(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("ATM has no cash");
	}

	@Override
	public void ejectCard() {
		System.out.println("ATM has no cash");
	}

	@Override
	public void insertPin(int pin) {
		System.out.println("ATM has no cash");

	}

	@Override
	public void requestCash(int n) {
		System.out.println("ATM has no cash");

	}

}
