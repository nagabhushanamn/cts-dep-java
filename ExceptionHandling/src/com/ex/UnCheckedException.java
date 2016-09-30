package com.ex;

class X {
	public void m1() {
		System.out.println("X : m1()");
		if (true) {
			throw new RuntimeException();
		}
	}
}

class Y {
	public void m2() {
		System.out.println("Y : m2()");
		X x = new X();
		x.m1();
	}
}

public class UnCheckedException {

	public static void main(String[] args) {

		try {

			Y y = new Y();
			y.m2();

		} catch (RuntimeException e) {
			System.out.println("Ex hanled in main()");
		}

	}

}
