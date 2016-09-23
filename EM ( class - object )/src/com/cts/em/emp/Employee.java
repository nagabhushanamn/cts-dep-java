// 1. package dec
package com.cts.em.emp;

// 2. import statements

// 3. public class
public class Employee {
	
	// 1. variables
	
		// a. class variables
		public final static String COMP_NAME="CTS";
	    public static String trainerName;
	
	    // b. obj variables
	    public int empId;
	    public String empName;
	
	// 2. constructor
	    
	    public Employee() {
			// TODO Auto-generated constructor stub
		}
	
	// 3. methods
	
	    // a. class methods
	    
	    public static void doTeach() {
			System.out.println("Employee::doTeach()");
		}
	
	    // b. object methods
	    public void doListen() {
			System.out.println(this.empName+ "::doListen");
		}
	
	// 4. inner class
	    
	    // Nil
}

// 4. default class

class Abc{
	
}
