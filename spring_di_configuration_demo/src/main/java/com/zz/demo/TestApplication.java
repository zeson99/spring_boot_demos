package com.zz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.zz.demo.earth.Alive;
import com.zz.demo.earth.Thing;
import com.zz.demo.earth.autoscanconfig.EarthWithOcean;
import com.zz.demo.earth.javaconfig.Earth;
import com.zz.demo.earth.xmlconfig.Jungle;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TestApplication.class, args);

		// java config demo
		Alive human = (Alive) context.getBean("human");
		Thing apple  = (Thing) context.getBean("apple");
		Earth earth = new Earth(human, apple);
		earth.run();

		earth = (Earth) context.getBean("earth");
		earth.run();
		
		// xml config demo
		Jungle jungle = (Jungle) context.getBean("jungle");
		jungle.run();

		// autowired demo
		EarthWithOcean earthWithOcean = (EarthWithOcean) context.getBean("earthWithOcean");
		earthWithOcean.run();
	}
}
