package com.shop.bill;

import com.shop.pm.PriceMatrix;

//import com.shop.pm.PriceMatrixImpl_v1;

/*
 * 
 *  OO principle
 *  
 *  " closed for modification , open for extension "
 * 
 *   design and performance issues
 *   ---------------------------------
 *   
 *   --> tight-coupling
 *     
 *       cause : can't extend 
 *      
 *   --> too many dependencies created and destructed
 *   
 *       memory , time , resources
 *   
 *   --> unit-testing not possible
 *   
 *       dev slow , bug is difficult
 *       
 *       
 *    --------------------------------------
 *    
 *    
 *    why these issues are happening ?
 *    
 *    
 *    --> dependent itself creating its own dependency.
 *    --> no 'Interfaces'
 *       
 *       
 *   soln :
 *   
 *    --> don't create dependency-object in dependent's class , do 'Lookup'
 *    --> use dependency's 'interfaces' , not impln references
 *    
 *    
 *    Limitation on "lookup'
 *    
 *    --> 'location' tight coupling
 *    
 *   best-soln:
 *   
 *   
 *       OO principle : 'Inversion Of Control'
 *       
 *    --> don't create & lookup the dependency in dependent's class , get/inject by 'some-one' ( IOC )
 *    
 *    
 *         how to implement IOC ?
 *         
 *         --> dependency injection ( IOC )
 *         
 *             constructor DI  
 *             setter DI
 *     
 * 
 * 
 */

public class BillingImpl {

	// private PriceMatrixImpl_v1 priceMatrix = null;
	private PriceMatrix priceMatrix = null;

	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	public double getTotalPrice(String[] cart) {

		double total = 0.0;
		// priceMatrix = new PriceMatrixImpl_v1();

		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}

		return total;

	}

}
