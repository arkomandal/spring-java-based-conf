package com.arkomandal.assignmentJBC;

import org.springframework.stereotype.Component;

@Component
public class Honda extends Car {
	
	Honda(Color color, Tyre tyre, Seat seat){
		super(color, tyre, seat);
	}
	
	
}
