package com.braxgunn;

import org.springframework.stereotype.Component;

@Component
public interface Engine {
	
	String engineName = "";
	
	String getEngineName();

	void setEngineName(String engineName);
	
	
}
