package com.zz.demo.earth.autoscanconfig;

import org.springframework.stereotype.Component;

@Component
public class PacificOcean implements Ocean {

	@Override
	public String name() {
		return "The Pacific Ocean";
	}

	@Override
	public int size() {
		return 10000;
	}
}
