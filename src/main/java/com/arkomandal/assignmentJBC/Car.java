package com.arkomandal.assignmentJBC;

public class Car {

	private Color color;;
	private Tyre tyre;
	private Seat seat;
	
	Car(Color color, Tyre tyre, Seat seat){
		this.color = color;
		this.tyre = tyre;
		this.seat = seat;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
}
