package com;

class A extends Object {
	public A(int a) {
		// super();
		System.out.println("im A");
	}

}

class B extends A {
	public B(int a) {
		super(a);
		System.out.println("im B");
	}
}

class C extends B {
	public C(int a) {
		super(a);
		System.out.println("im C");
	}
}

public class Constructor_Exe_Flow {

	public static void main(String[] args) {

		C c = new C(123);

	}

}
