package com;

// reference  --> objects

/*
 * 
 * imp note : if 2 references having IS-A r/s , then only reference type casting possible
 * 
 */

class V {

}

class Bike extends V {

}

class Car extends V {

}

public class ReferenceCasting_Demo {

	public static void main(String[] args) {

		// Bike bike=new Bike();
		// Car car = new Car();

		// Bike bike=new Car(); // not possible

		// -----------------------------------

		// implicit reference casting

		//
		// V v=new Bike();
		// v=new Car();

		// -------------------------------------

		// Explicit reference casting

		V v = new Bike(); // call it as 'vehicle'
		//v = new Car();

		if (v instanceof Bike) {
			Bike bike = (Bike) v; // explicit casting
			System.out.println("Happy casting..");
		}else{
			System.out.println("sorry..");
		}

	}

}
