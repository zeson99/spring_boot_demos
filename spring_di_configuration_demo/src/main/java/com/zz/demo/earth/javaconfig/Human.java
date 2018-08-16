package com.zz.demo.earth.javaconfig;

import com.zz.demo.earth.Alive;
import com.zz.demo.earth.Thing;

public class Human implements Alive {

	@Override
	public String name() {
		return "human";
	}

	@Override
	public void eat(Thing f) {
		System.out.println(this.name() + " is eating " + f.name());
	}
}
