package com.arkomandal.assignmentJBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Honda implements Car {

	@Autowired()
	private Color color;

	@Autowired()
	private Tyre tyre;

	@Autowired()
	private Seat seat;

	@Value("Honda")
	String name;

	public void feature() {
		System.out.println("Car: " + this.name + ", Color: " + color.getColor() + ", Tyre: " + tyre.getTyre()
				+ ", Seat: " + seat.getSeat());
	}

}
