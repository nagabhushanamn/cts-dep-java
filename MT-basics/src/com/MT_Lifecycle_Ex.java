package com;

class NumberWork implements Runnable {

	// READY-TO-RUN ---> RUNNING
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 500; i++) {
			System.out.println(name + " --> " + i);
		}

	} // RUNNING --> DEAD
}

public class MT_Lifecycle_Ex {

	public static void main(String[] args) {

		NumberWork nw = new NumberWork();

		Thread thread1 = new Thread(nw, "A"); // NEW
		thread1.start(); // NEW --> READY-TO-RUN ( Runnable )

		Thread thread2 = new Thread(nw, "B"); // NEW
		thread2.start(); // NEW --> READY-TO-RUN ( Runnable )

		Thread thread3 = new Thread(nw, "C"); // NEW
		thread3.start(); // NEW --> READY-TO-RUN ( Runnable )

		String name = Thread.currentThread().getName();
		for (int i = 0; i < 500; i++) {
			System.out.println(name + " --> " + i);
		}

	}

}
