package com.designpattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		ExecutorService service =  Executors.newFixedThreadPool(5);
		
		for(int i=0;i<10;i++){
			service.execute(()->{
				SingletonClass instance = SingletonClass.getInstance();
				System.out.println(Thread.currentThread().getName()+" :Count= " +instance.getCount() );
			});
		}
		service.shutdown();
	

	}

}
