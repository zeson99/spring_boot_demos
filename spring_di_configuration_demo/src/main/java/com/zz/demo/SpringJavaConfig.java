package com.zz.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zz.demo.earth.javaconfig.Apple;
import com.zz.demo.earth.javaconfig.Earth;
import com.zz.demo.earth.javaconfig.Human;

@Configuration
public class SpringJavaConfig {

	@Bean(name="human")
	public Human human() {
		return new Human();
	}
	
	@Bean(name="apple")
	public Apple apple() {
		return new Apple();
	}

	@Bean(name="earth")
	public Earth earth() {
		return new Earth(human(), apple());
	}
}
