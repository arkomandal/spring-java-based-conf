package com.arkomandal.assignmentJBC;

import org.springframework.stereotype.Component;

@Component
public class Maruti extends Car {

	Maruti(Color color, Tyre tyre, Seat seat) {
		super(color, tyre, seat);
	}

}
