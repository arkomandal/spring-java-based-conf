package com.arkomandal.assignmentJBC;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	String tyre;

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}
	
	public String getTyre() {
		return tyre;
	}

}
