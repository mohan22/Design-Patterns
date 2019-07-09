package com.designpattern.singleton;

public class SingletonClass {
	private int count=0;
	private SingletonClass(){
		count++;
	}
	
	private static final class InnerClass{
		final static SingletonClass INSTANCE = new SingletonClass();
	}
	
	public static SingletonClass getInstance(){
		return InnerClass.INSTANCE;
	}

	public int getCount(){
		return count;
	}
}
