package com.arkomandal.assignmentJBC;

import java.util.ArrayList;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

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

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("maruti");
		cars.add("hyundai");
		cars.add("honda");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Color color = (Color) context.getBean("color");
		Tyre tyre = (Tyre) context.getBean("tyre");
		Seat seat = (Seat) context.getBean("seat");

		Scanner sc = new Scanner(System.in);
		System.out.println("Select Color: ");
		for (int i = 0; i < colors.size(); i++) {
			System.out.println("Type " + i + " for " + colors.get(i));
		}
		
		int c = sc.nextInt();
		color.setColor(colors.get(c));

		System.out.println("Select Tyre: ");
		for (int i = 0; i < tyres.size(); i++) {
			System.out.println("Type " + i + " for " + tyres.get(i));
		}
		
		int t = sc.nextInt();
		tyre.setTyre(tyres.get(t));

		System.out.println("Select Seat: ");
		for (int i = 0; i < seats.size(); i++) {
			System.out.println("Type " + i + " for " + seats.get(i));
		}
		
		int s = sc.nextInt();
		seat.setSeat(seats.get(s));

		System.out.println("Select Car: ");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Type " + i + " for " + cars.get(i));
		}
		
		int cn = sc.nextInt();

		Car car = (Car) context.getBean(cars.get(cn));

		car.feature();

	}

}