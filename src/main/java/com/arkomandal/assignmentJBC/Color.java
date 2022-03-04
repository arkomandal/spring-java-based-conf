package com.arkomandal.assignmentJBC;

import org.springframework.stereotype.Component;

@Component
public class Color {

	String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

}
