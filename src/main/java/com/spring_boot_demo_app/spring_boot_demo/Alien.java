package com.spring_boot_demo_app.spring_boot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring_boot_demo_app.Laptop;

@Component
public class Alien {

    @Autowired
    Laptop laptop;

    public void code() {
        laptop.compile();
    }
}
