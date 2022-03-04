package com.arkomandal.assignmentJBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.arkomandal.assignmentJBC" })
public class AppConfig {

	@Bean()
	public Color getColor() {
		return new Color();
	}

	@Bean()
	public Tyre getTyre() {
		return new Tyre();
	}

	@Bean()
	public Seat getSeat() {
		return new Seat();
	}
	
	@Bean()
	public Maruti getMaruti() {
		return new Maruti();
	}
	
	@Bean()
	public Hyundai getHyundai() {
		return new Hyundai();
	}
	
	@Bean()
	public Honda getHonda() {
		return new Honda();
	}

}
