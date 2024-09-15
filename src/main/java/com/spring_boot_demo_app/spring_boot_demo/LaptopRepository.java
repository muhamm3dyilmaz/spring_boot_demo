package com.spring_boot_demo_app.spring_boot_demo;

import org.springframework.stereotype.Repository;

import com.spring_boot_demo_app.spring_boot_demo.model.Laptop;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop) {
        System.out.println("---> Datas are saved to database!");
    }

}
