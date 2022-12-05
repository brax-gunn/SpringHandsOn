package com.braxgunn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("wagonar",Car.class);
		
		System.out.println(myCar.modelName());
		
		context.close();
		
	}

}
