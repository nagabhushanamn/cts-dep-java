package com;

import java.util.Scanner;

class Task1 {

	public void doTask1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name!");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		scanner.close();
	}
}

class Task2 {
	public void doTask2() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

public class SingleThreadApp {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " start..");

		// step-1
		Task1 task1 = new Task1();
		task1.doTask1();

		// step-2
		Task2 task2 = new Task2();
		task2.doTask2();

		// step-3
		System.out.println("step-3...");

		// step-n..

	}

}
