package com.arkomandal.assignmentJBC;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class App {
//	@Autowired

//	@Autowired
//	Hyundai hyundai;
//
//	@Autowired
//	Honda honda;

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Grey");

		ArrayList<String> tyres = new ArrayList<String>();
		tyres.add("MRF");
		tyres.add("CEAT");
		tyres.add("Panasonic");

		ArrayList<String> seats = new ArrayList<String>();
		seats.add("Chicco");
		seats.add("Britax");
		seats.add("Evenflo");

		Color color = new Color(colors.get(0));
		Seat seat = new Seat(seats.get(0));
		Tyre tyre = new Tyre(tyres.get(0));

		Maruti maruti = new Maruti(color, tyre, seat);

		ArrayList<Car> car = new ArrayList<Car>();

		car.add(maruti);

		System.out.println("Cars: ");
		for (Car c : car) {
			System.out.println("Class: " + c.getClass().getSimpleName() + ", Color: " + c.getColor().getColor() + ", Tyre: " + c.getTyre().getTyre() + ", Seat: " + c.getSeat().getSeat());
		}

	}
}
