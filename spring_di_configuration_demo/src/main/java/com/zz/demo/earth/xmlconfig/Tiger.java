package com.zz.demo.earth.xmlconfig;

import com.zz.demo.earth.Alive;
import com.zz.demo.earth.Thing;

public class Tiger implements Alive {

	@Override
	public String name() {
		return "tiger";
	}

	@Override
	public void eat(Thing f) {
		System.out.println(this.name() + " is eating " + f.name());
	}
}
