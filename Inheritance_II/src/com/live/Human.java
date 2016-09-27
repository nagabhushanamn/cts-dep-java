package com.live;

public class Human extends LivingThing {

	public void study() {
		System.out.println("human study...");
	}

	// override
	public void work() {
		System.out.println("Human work with study-knowledge");
	}

}
