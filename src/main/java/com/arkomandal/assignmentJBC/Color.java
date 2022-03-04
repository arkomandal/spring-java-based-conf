package com.arkomandal.assignmentJBC;

import java.util.ArrayList;

public class Color {

	ArrayList<String> colors = new ArrayList<String>();

	Color() {
		colors.add("Red");
		colors.add("Blue");
		colors.add("Grey");
	}

	public ArrayList<String> getColors() {
		return colors;
	}

	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
	

}
