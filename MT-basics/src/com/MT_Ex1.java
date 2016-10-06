package com;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class Work implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " running this work...");
	}

}

public class MT_Ex1 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " start");

		Work work = new Work();

		// Thread thread = new Thread(work);
		// thread.start(); // new stack-memory allocated......

		// or  'Executor Framework '  for thread management
		
		Executor executor = Executors.newFixedThreadPool(1);
		executor.execute(work);

		System.out.println(Thread.currentThread().getName() + " continue with other work..");

	}

}
