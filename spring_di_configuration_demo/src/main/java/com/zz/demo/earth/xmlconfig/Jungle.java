package com.zz.demo.earth.xmlconfig;

import com.zz.demo.earth.Alive;
import com.zz.demo.earth.Thing;

public class Jungle {

	private Alive alive;

	private Thing food;

	public Jungle(Alive alive, Thing food) {
		this.alive = alive;
		this.food  = food;
	}

	public void run() {
		alive.eat(food);
	}
}
