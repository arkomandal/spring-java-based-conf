package com.arkomandal.assignmentJBC;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	public Maruti getMaruti() {
		return new Maruti();
	}
	
	public Hyundai getHyundai() {
		return new Hyundai();
	}
	
	public Honda getHonda() {
		return new Honda();
	}

}
