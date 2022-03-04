package com.arkomandal.assignmentJBC;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Hello world!
 *
 */
public class App {
//	@Autowired

//	@Autowired
//	Hyundai hyundai;
//
//	@Autowired
//	Honda honda;

	public static void main(String[] args) {
		
		Maruti maruti = new Maruti("Red", "Ceat", "Maruti");
		Hyundai hyundai = new Hyundai("White", "MRF", "Hyundai");
		
		ArrayList<Car> car = new ArrayList<Car>();
		
		car.add(maruti);
		car.add(hyundai);
		
		System.out.println("Select Car: ");
		for(Car c : car) {
			System.out.println(c.getClass());
		}

	}
}
