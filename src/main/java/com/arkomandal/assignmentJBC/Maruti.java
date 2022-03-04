package com.arkomandal.assignmentJBC;

import org.springframework.stereotype.Component;

@Component
public class Maruti extends Car {
	
	Maruti(String color, String tyre, String seat) {
		super(color, tyre, seat);
	}
	
}
