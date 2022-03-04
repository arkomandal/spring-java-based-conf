package com.arkomandal.assignmentJBC;

import org.springframework.stereotype.Component;

@Component
public class Hyundai extends Car {
	
	Hyundai(String color, String tyre, String seat) {
		super(color, tyre, seat);
	}

}
