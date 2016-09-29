package com.ex;

class Employee {
	public void doWork() {
		System.out.println("Emp working");
	}
}

public class Try_Catch_Syntax {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			System.out.println("B");

			int ari = 1 / 1;

			int[] arr = { 1, 2 };
			System.out.println(arr[0]);

			Employee employee = null;
			employee.doWork();

			System.out.println("C");

		}
		//		catch (ArithmeticException e) {
		//			System.out.println("Arith Ex Handled");
		//		} catch (ArrayIndexOutOfBoundsException e) {
		//			System.out.println("AIOOBE Ex Handled");
		//		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println(" Arith or Array error handled");
		}
		catch (Exception e) {
			System.out.println("Ex Handled");
		}

		System.out.println("E");

	}

}
