package com.zz.demo.earth.autoscanconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EarthWithOcean {

	@Autowired
	Ocean ocean;

	public void run() {
		System.out.println("ocean:" + ocean.name());
	}
}
