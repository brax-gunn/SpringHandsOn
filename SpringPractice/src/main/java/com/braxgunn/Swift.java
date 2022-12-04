package com.braxgunn;

import org.springframework.stereotype.Component;

@Component("swift")
public class Swift implements Car {
	
	public String modelName() {
		return "Swift Dezire - Petrol";
	}
	

}
