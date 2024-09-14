package com.spring_boot_demo_app.spring_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		Alien alien = context.getBean(Alien.class);

		alien.code();
	}

}
