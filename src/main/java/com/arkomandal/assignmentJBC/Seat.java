package com.arkomandal.assignmentJBC;

import org.springframework.stereotype.Component;

@Component
public class Seat {
	
	String seat;

	public void setSeat(String seat) {
		this.seat = seat;
	}
	
	public String getSeat() {
		return seat;
	}
	
}
