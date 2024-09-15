package com.spring_boot_demo_app.spring_boot_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    public void compile() {
        System.out.println("---> Desktop is compiling...");
    }

}
