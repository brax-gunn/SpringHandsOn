package com.braxgunn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.braxgunn")
public class AppConfig {
	
	@Bean("wagonar")
	public Wagonar wagonar() {
		return new Wagonar();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("v6")
	public V6 v6() {
		return new V6();
	}
	
	@Bean("v8")
	public V8 v8() {
		return new V8();
	}

}
