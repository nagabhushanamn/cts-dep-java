package com;

class Student extends Thread {
	public void run() {
		System.out.println("stud : Learning Java");
		System.out.println("got doubt ");

		Trainer trainer = new Trainer();
		trainer.start();

		try {
			trainer.join(0);
			// trainer.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("student happy on soln");

	};
}

class Trainer extends Thread {

	public void run() {
		System.out.println("working on doubt");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("found soln for prob. ...");
	}
}

public class MT_Join_Ex {

	public static void main(String[] args) {

		Student student = new Student();
		student.start();

	}

}
