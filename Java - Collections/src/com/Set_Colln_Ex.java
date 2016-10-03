package com;

import java.util.HashSet;
import java.util.Set;

/*
 *   0                                            100 
 *   -----------------------------------------------
 *   | | | | | | | | | Nag| .......
 *   -----------------------------------------------
 *                    34
 * 
 *   entry/element  ( Nag )
 *   
 *           hashing(element's indenttiy)  ---->  hashcode : 34
 *           
 *   
 *           
 *           identity  -->   hashcode : 34
 * 
 * ------------------------------------------------------
 * 
 * 
 *  2 objs with same content , shud have same hash-code
 *  
 *  2 objs with different content , may have same hash-code
 *  
 *  ------------------------------------------------------
 * 
 * 
 */

class Car extends Object {

	String model;
	String color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
	
	

}

public class Set_Colln_Ex {

	public static void main(String[] args) {

		// Set<String> set = new HashSet<>();
		// set.add("Nag");
		// set.add("Indu");
		// set.add("Ria");
		// set.add("Ria");
		// // set.add(null);
		// // set.add(null);
		//
		// System.out.println(set);

		// -----------------------------------------

		Set<Car> cars = new HashSet<>();

		Car car1 = new Car("BMW", "black");
		Car car2 = new Car("BMW", "black");

		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());

		cars.add(car1);
		cars.add(car2);

		System.out.println(cars.size());
		// --------------------------------------

	}

}
