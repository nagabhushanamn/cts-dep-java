package com;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

class Product implements Comparable<Product> {

	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		if (this.id == o.id) {
			return 0;
		} else if (this.id > o.id) {
			return 1;
		} else {
			return -1;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

		// Set<Car> cars = new HashSet<>(); // un-ordered
		//
		// Car car1 = new Car("BMW", "black");
		// Car car2 = new Car("BMW", "black");
		//
		// // Car car3 = new Car("BWM", "black");
		//
		// System.out.println(car1.hashCode());
		// System.out.println(car2.hashCode());
		// // System.out.println(car3.hashCode());
		//
		// cars.add(car1);
		// cars.add(car2);
		//
		// System.out.println(cars.size());

		// --------------------------------------
		//
		// Set<String> set=new LinkedHashSet<>(); // ordered
		// set.add("B");
		// set.add("A");
		// set.add("D");
		// set.add("B");
		//
		// System.out.println(set);
		//
		// --------------------------------------

		// Set<String> set=new TreeSet<>(); // B-Tree , sorted
		// set.add("A");
		// set.add("C");
		// set.add("B");
		// set.add("D");
		// set.add("A");
		//
		// System.out.println(set); //

		// -----------------------------------------

		Product product1 = new Product(12313, "Laptop", 198000.00);
		Product product2 = new Product(24234, "IPad", 8000.00);
		Product product3 = new Product(12334, "Mobile-1", 2000.00);
		Product product4 = new Product(12334, "Mobile-2", 4000.00);

		// sort by Name
		// Set<Product> products = new TreeSet<>(new ProductsByName());

		// Set<Product> products = new TreeSet<>(new Comparator<Product>(){
		// @Override
		// public int compare(Product o1, Product o2) {
		// return o1.getName().compareTo(o2.getName());
		// }
		// });
		
		// JDK 1.8 ==> Lambda Expressions
		Set<Product> products = new TreeSet<>((o1,o2)->{return o1.getName().compareTo(o2.getName());});

		// products.add(null);
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);

		display(products);

		// ---------------------------------------------

	}

	private static void display(Set<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

	// ---------------------------------------------------

}

//
// class ProductsByName implements Comparator<Product>{
// @Override
// public int compare(Product o1, Product o2) {
// return o1.getName().compareTo(o2.getName());
// }
// }
