package com.designpattern.state;

public class NoCard implements ATMState {
	ATMMachine atmMachine;

	public NoCard(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("Card inserted");
		atmMachine.setATMState(atmMachine.getYesCardState());
	}

	@Override
	public void ejectCard() {
		System.out.println("Do not have card to eject");
	}

	@Override
	public void insertPin(int pin) {
		System.out.println("ATM has no card inserted");
	}

	@Override
	public void requestCash(int n) {
		System.out.println("ATM has no card inserted");
	}

}
