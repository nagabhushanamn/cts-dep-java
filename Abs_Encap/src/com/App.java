package com;

import com.emp.Employee;

import p1.A;
import p1.B;
import p1.C;
import p2.D;
import p2.E;

public class App {

	public static void main(String[] args) {

		// A a=new A();
		// a.aMethod();

		// B b=new B();
		// b.bMethod();

		// C c = new C();
		// c.cMethod();

		// D d=new D();
		// d.dMethod();

		// E e = new E();
		// e.eMethod();

		// ----------------------------------

		//Employee employee = new Employee();
		// employee.id=123;
		// employee.name="A";
		// employee.salary=1000.00;
		// employee.bonus=employee.salary*0.3;

		//System.out.println(employee);

		// obj's constraints are damaging without any restrictions
		// employee.bonus=100000;
		// System.out.println(employee);

		// employee.salary=-1000;
		// employee.salary=20000;
		
		//----------------------------------------
		
		
		Employee employee = new Employee();
		employee.setSalary(1000);
		employee.setSalary(2000);
		
		
		System.out.println(employee);
		
//		----------------------------------------
		

	}

}
