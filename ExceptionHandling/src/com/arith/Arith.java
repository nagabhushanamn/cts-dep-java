package com.arith;

import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {

		System.out.println("start..");
		
		try{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num-1");
		int num1 = sc.nextInt();
		System.out.println("Enter num-2");
		int num2 = sc.nextInt();

		// 1. add
		System.out.println("1.Add");

		// 2. sub
		System.out.println("2.Sub");

		// 3. Div
		System.out.println("3.Div");
		//if (num2 != 0) {
			float divResult = num1 / num2;
		//} else {
			System.out.println("cant divide..");
		//}

		// 4. Mul
		System.out.println("4.Mul");

		// 5........
		
		}catch(ArithmeticException ae){
			
			// handle here
			
			// report with friendly message to end-user
			// log error
			// release/clean used resources
			
			// re-throw to dependent module...
		}

		System.out.println("happy end..");
		
		
	}

}
