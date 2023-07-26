package Springboot;

package com.SpringLog.SpringWorks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringWorksApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext context = SpringApplication.run(SpringWorksApplication.class, args);
	
	control A = context.getBean(control.class);
	
	A.Work();
	
		
	}
}

