package com.cts.em.hr;

import com.cts.em.emp.Employee;

public class HR {

	public static void manageEmployees() {

		// create employee objects

		Employee.trainerName = "Nag";

		Employee e1 = new Employee();
		e1.empId = 101;
		e1.empName = "A";

		Employee e2 = new Employee();
		e1.empId = 102;
		e2.empName = "B";

		// ..........

		// teach and make them listen

		Employee.doTeach();


		e1.doListen();
		e2.doListen();

	}

}
