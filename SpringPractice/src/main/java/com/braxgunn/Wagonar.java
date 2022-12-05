package com.braxgunn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wagonar")
public class Wagonar implements Car {
	
	@Autowired(required=false)
	@Qualifier("V6")
	Engine engine;
	

	
	public Engine getEngine() {
		return engine;
	}

	
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	


	public String modelName() {
		return "Wagonar Classic - CNG" + " | " + engine.getEngineName();
	}

}
