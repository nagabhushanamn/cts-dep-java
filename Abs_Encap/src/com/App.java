package com;

import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

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

		// Employee employee = new Employee();
		// employee.id=123;
		// employee.name="A";
		// employee.salary=1000.00;
		// employee.bonus=employee.salary*0.3;

		// System.out.println(employee);

		// obj's constraints are damaging without any restrictions
		// employee.bonus=100000;
		// System.out.println(employee);

		// employee.salary=-1000;
		// employee.salary=20000;

		// ----------------------------------------

		// Employee employee = new Employee();
		// employee.setSalary(1000);
		// employee.setSalary(2000);
		//
		//
		// System.out.println(employee);

		// ----------------------------------------

		// shopping...

		// some-one or comp-manger or container    ( spring f.w )
		
		// Init
		PriceMatrix priceMatrixV1=new PriceMatrixImpl_v1();
		PriceMatrix priceMatrixV2=new PriceMatrixImpl_v2();
		
		BillingImpl billingComp = new BillingImpl(priceMatrixV2);

		// Use
		String[] cart = { "234234", "345345" };
		double totalPrice = billingComp.getTotalPrice(cart);
		System.out.println("Total Price - " + totalPrice);

		// destroy
		billingComp = null;

	}

}
