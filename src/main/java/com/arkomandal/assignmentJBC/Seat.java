package com.arkomandal.assignmentJBC;

import java.util.ArrayList;

public class Seat {
	
	ArrayList<String> seats = new ArrayList<String>();

	Seat() {
		seats.add("Chicco");
		seats.add("Britax");
		seats.add("Evenflo");
	}

	public ArrayList<String> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<String> seats) {
		this.seats = seats;
	}
	
}
