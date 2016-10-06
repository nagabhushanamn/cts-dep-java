package com;

class Worker extends Thread {

	public Worker(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " running this work..");
	}

}

public class MT_Ex2 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " start");

		Worker worker = new Worker("Nag");
		worker.start();

		System.out.println(Thread.currentThread().getName() + " continue with other work..");

	}

}
