package com.arkomandal.assignmentJBC;

public class Car {

	private String color = "";
	private String tyre = "";
	private String seat = "";
	
	Car(String color, String tyre, String seat){
		this.color = color;
		this.tyre = tyre;
		this.seat = seat;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}
}
