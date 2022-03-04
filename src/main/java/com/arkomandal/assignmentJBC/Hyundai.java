package com.arkomandal.assignmentJBC;

import org.springframework.stereotype.Component;

@Component
public class Hyundai extends Car {
	
	Hyundai(Color color, Tyre tyre, Seat seat) {
		super(color, tyre, seat);
	}

}
