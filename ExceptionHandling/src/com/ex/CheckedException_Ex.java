package com.ex;

import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  some-examples for checked-exceptions
 *  
 *  
 *  --> IO operations
 *  
 *  --> SQL exceptions
 *  
 *  --> networking operations
 *  
 * 
 * 
 */

class A {

	public void m1() throws IOException {
		System.out.println("A: m1()");
		throw new IOException();
	}

}

class B {

	public void m2() {

		System.out.println("B: m2()");

		A other = new A();

		try {
			other.m1();
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("IOException Handled by B-Module");
		}

	}

}

class Parent {

	public void m() throws Exception {

	}
}

class Child extends Parent {

	@Override
	public void m() throws IOException {
		// ...
	}

}

public class CheckedException_Ex {

	public static void main(String[] args) {

		B my = new B();
		my.m2();

		// ----------------

		Child child = new Child();
		// child.m();

	}

}
