package com;

import com.emp.TechEmployee;

public class App {

	public static void main(String[] args) {

		TechEmployee techEmployee = new TechEmployee(123);
		// techEmployee.id = 123;
		techEmployee.setName("Nag");
		techEmployee.setSalary(1000.00);

		techEmployee.techSkill = "Java";

		System.out.println(techEmployee);

		// -----------------------------------

		// techEmployee.id=0; // un-expected ...

		// -----------------------------------

		System.out.println(techEmployee);

	}

}
