package com.designpattern.state;

public class TestClass {

	public static void main(String[] args) {
		ATMMachine atm = new ATMMachine();
		atm.requestCash(10);
		atm.insertPin(1234);
		atm.insertCard();
		atm.insertPin(1234);
		atm.requestCash(2000);
		atm.insertCard();
		atm.insertPin(1234);
		atm.requestCash(200);

	}

}
