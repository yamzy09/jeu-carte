package com.atexo.jeucarte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JeuCarteApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(JeuCarteApplication.class,args);
	}

}
