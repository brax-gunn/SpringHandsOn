package com.braxgunn;

import org.springframework.stereotype.Component;

@Component("wagonar")
public class Wagonar implements Car {
	
	public String modelName() {
		return "Wagonar Classic - CNG";
	}

}
