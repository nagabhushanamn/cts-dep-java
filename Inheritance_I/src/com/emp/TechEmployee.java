package com.emp;

public class TechEmployee extends Employee {

	// public int id;
	// public String name;
	// public double salary;
	public String techSkill;

	public TechEmployee(int id) {
		super(id);
	}

	
	@Override
	public String toString() {
		return "TechEmployee [techSkill=" + techSkill + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getSalary()=" + getSalary() + "]";
	}

}
