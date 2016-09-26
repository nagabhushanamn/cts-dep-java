package com;

interface A {

}

interface B {

}

//
interface I extends A, B {

	// constant state
	public static final int VAR = 123;

	// abstract behav
	public abstract double getPrice(String item) throws Exception;

	public abstract double getDiscount(String item) throws Exception;

	// JDK 1.8
	public default double newMethod(String item) {
		return 0.0;
	}

	public static double staMethod() {
		return 0.0;
	}

}

class Impl implements I {

	@Override
	public double getPrice(String item) throws Exception {
		return 0;
	}

	@Override
	public double getDiscount(String item) throws Exception {
		return 0;
	}

}

public class App_Interface_Syntax {

	public static void main(String[] args) {

		Impl impl = new Impl();
		impl.newMethod("2313");

		I.staMethod();

	}

}
