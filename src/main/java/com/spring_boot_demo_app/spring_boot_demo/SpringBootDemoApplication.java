package com.spring_boot_demo_app.spring_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring_boot_demo_app.spring_boot_demo.model.Laptop;
import com.spring_boot_demo_app.spring_boot_demo.service.LaptopService;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop laptop = context.getBean(Laptop.class);
		service.addLaptop(laptop);

		// Alien alien = context.getBean(Alien.class);
		// System.out.println("---> Age: " + alien.getAge());
		// alien.code();
	}

}
