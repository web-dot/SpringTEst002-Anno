package com.mavenspring.Spring002_Anno;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public void process() {
		
		System.out.println("SnapDragon processing data");

	}

}
