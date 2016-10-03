package com;

// JDK 1.5  --- > generic

class Subject {

}

class Java extends Subject {

}

class JavaScript extends Subject {

}

class Trainer<T extends Subject> {

	T subject;

	public Trainer(T subject) {
		super();
		this.subject = subject;
	}

	public T getSubject() {
		return subject;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}

}

public class Generic_Ex {

	public static void main(String[] args) {

		Trainer<Java> javaTrainer = new Trainer<Java>(new Java()); // Type
																	// safety
																	// objs
		Trainer<JavaScript> javaScriptTrainer = new Trainer<JavaScript>(new JavaScript());

		// Trainer<String> trainer=null;
		// ---------------------------------------------

		// javaTrainer.setSubject(new JavaScript()); // damaging type of
		// javaTrainer ( Type Safefty )

		// ---------------------------------------------

		// Object subject=javaTrainer.getSubject();
		// Java java=(Java)subject;

		Java java = javaTrainer.getSubject();

		System.out.println("Happy Learning...");

	}

}
