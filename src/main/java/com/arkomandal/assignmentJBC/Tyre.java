package com.arkomandal.assignmentJBC;

import java.util.ArrayList;

public class Tyre {

	ArrayList<String> tyres = new ArrayList<String>();
	
	Tyre(){
		tyres.add("MRF");
		tyres.add("CEAT");
		tyres.add("Panasonic");
	}

	public ArrayList<String> getTyres() {
		return tyres;
	}

	public void setTyres(ArrayList<String> tyres) {
		this.tyres = tyres;
	}
	
}
