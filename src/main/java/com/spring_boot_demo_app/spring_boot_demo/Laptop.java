package com.spring_boot_demo_app.spring_boot_demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public void compile() {
        System.out.println("---> Laptop is compiling...");
    }

}
