package com.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SandBoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SandBoxApplication.class, args);
	}

}
