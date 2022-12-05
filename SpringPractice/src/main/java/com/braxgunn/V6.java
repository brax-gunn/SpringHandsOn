package com.braxgunn;

import org.springframework.stereotype.Component;

@Component("V6")
public class V6 implements Engine {
	
	String engineName = "V6 Engine";
	
	public String getEngineName() {
		return this.engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
		
	}

}
