package com.zz.demo.earth.javaconfig;

import com.zz.demo.earth.Alive;
import com.zz.demo.earth.Thing;

public class Earth {

	Alive alive;

	Thing food;
	
	public Earth(Alive alive, Thing food) {
		this.alive = alive;
		this.food  = food;
	}

	public void run() {
		alive.eat(food);
	}
}
