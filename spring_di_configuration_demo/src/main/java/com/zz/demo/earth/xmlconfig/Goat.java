package com.zz.demo.earth.xmlconfig;

import com.zz.demo.earth.Alive;
import com.zz.demo.earth.Thing;

public class Goat implements Thing, Alive {

	@Override
	public String name() {
		return "goat";
	}

	@Override
	public void eat(Thing f) {
		System.out.println(this.name() + " is eating " + f.name());
	}
}
