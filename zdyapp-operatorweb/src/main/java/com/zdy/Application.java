package com.zdy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		try {
			
			SpringApplication.run(Application.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}