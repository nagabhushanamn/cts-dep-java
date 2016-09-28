package com;

/*
 *   8 primitives
 *   
 *   byte  ( 8  )
 *   short ( 16 )
 *   int   ( 32 )
 *   long  ( 64 )
 *   
 *   float ( 32 )
 *   double( 64 )
 *   
 *   char  ( 16 )
 *   
 *   boolean ( 1 )  --> ( not applicable for type casting )
 * 
 * 
 *   ----------------------------------------------------
 *   
 *    range ==> -2^n-1  to 2^n-1 -1
 *    
 *    e.g  byte , n--> 8
 *    
 *              -128  to 127    
 *              
 *              
 *              0,..........127,-128,-127,......-1  ==> 256
 *    
 *   
 *   -----------------------------------------------------
 */

public class PrimitiveCasting_Demo {

	public static void main(String[] args) {

		// byte b = 12;
		// int i = b; // implicit
		//
		// b = (byte) i; // explict

		// -------------------------

		// int i = 456;
		// byte b = (byte) i;
		// System.out.println(b);

		// -------------------------
		
		for (int i = 0; i <128; i++) {
			System.out.printf("%d ---> %c \n",i,(char)i);
		}
		
		// -------------------------

	}

}
