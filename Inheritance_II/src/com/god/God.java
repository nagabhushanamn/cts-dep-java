package com.god;

import com.live.Animal;
import com.live.Human;
import com.live.LivingThing;

// OO principle : " closed for modification , open for extension "

public class God {

	// public void manageHuman(Human human) {
	// human.eat();
	// human.sleep();
	// human.study();
	// human.work();
	// }
	//
	// public void manageAnimal(Animal animal) {
	// animal.eat();
	// animal.sleep();
	// animal.work();
	// }

	// Runtime Polymorsphism
	public void manageLT(LivingThing liveThing) {
		liveThing.eat();
		liveThing.sleep();
		if(liveThing instanceof Human){
			Human human=(Human)liveThing; // explicit casting
			human.study();
		}
		liveThing.work();
	}

}
