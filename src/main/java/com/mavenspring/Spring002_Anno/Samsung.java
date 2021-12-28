package com.mavenspring.Spring002_Anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mySamsung")
public class Samsung {
	
	@Autowired
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octa core, 4 gb ram, 12MP camera");
		cpu.process();
	}
}
