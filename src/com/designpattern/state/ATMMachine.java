package com.designpattern.state;

public class ATMMachine {
	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutofMoney;

	ATMState atmState;

	int cashInMachine = 1000;
	boolean correctPinEntered = false;

	public ATMMachine() {
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutofMoney = new NoCash(this);

		atmState = noCard;

		if (cashInMachine == 0)
			atmState = atmOutofMoney;
	}

	public void setATMState(ATMState newState) {
		atmState = newState;
	}

	public void setCashInMachine(int newCash) {
		cashInMachine = newCash;
	}

	public void insertCard() {
		atmState.insertCard();
	}

	public void ejectCard() {
		atmState.ejectCard();
	}

	public void requestCash(int cash) {
		atmState.requestCash(cash);
	}

	public void insertPin(int pin) {
		atmState.insertPin(pin);
	}

	public ATMState getYesCardState() {
		return hasCard;
	}

	public ATMState getNoCardState() {
		return noCard;
	}

	public ATMState getHasPin() {
		return hasCorrectPin;
	}

	public ATMState getNoCashState() {
		return atmOutofMoney;
	}
}
