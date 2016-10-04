package com;

import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.TreeMap;

class Owner implements Comparable<Owner> {

	String name;

	public Owner(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Owner o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

}

class Vehicle {

	String type;

	public Vehicle(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + "]";
	}

}

public class Map_Colln_Demo {

	public static void main(String[] args) {

		Owner owner1 = new Owner("Nag");
		Owner owner2 = new Owner("Ria");

		Vehicle vehicle1 = new Vehicle("car");
		Vehicle vehicle2 = new Vehicle("toy");

		// ---------------------------------

		// Map<Owner, Vehicle> map = new HashMap<>();
		// Map<Owner, Vehicle> map = new LinkedHashMap<>();
		// Map<Owner, Vehicle> map = new TreeMap<>();
		Map<Owner, Vehicle> map = new Hashtable<>();
		map.put(owner1, vehicle1);
		map.put(owner2, vehicle2);

		Properties prop = new Properties();
		

		// ------------------------------------

		System.out.println("Enter owner name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		Owner key = new Owner(name);

		Vehicle vehicle = map.get(key);
		if (vehicle != null) {
			System.out.println(vehicle);
		} else {
			System.out.println("U dont have vehicle..");
		}

		sc.close();
	}

}
