package com.emp;



// Java Bean / POJO

public class Employee {

	private int id;
	private String name;
	private double salary;
	private double bonus;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
			this.bonus = salary * 0.3;
		}
	}

	public double getBonus() {
		return bonus;
	}
	//
	// public void setBonus(double bonus) {
	// this.bonus = bonus;
	// }

}
