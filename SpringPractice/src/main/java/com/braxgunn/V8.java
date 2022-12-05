package com.braxgunn;

import org.springframework.stereotype.Component;

@Component("V8")
public class V8 implements Engine {

	String engineName = "V8 Engine";
	
	public String getEngineName() {
		return this.engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
		
	}
	
	

}
