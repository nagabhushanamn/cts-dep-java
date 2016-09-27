package com.emp;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee(int id) {
		if (id > 0) {
			this.id = id;
		} else {
			throw new RuntimeException();
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
