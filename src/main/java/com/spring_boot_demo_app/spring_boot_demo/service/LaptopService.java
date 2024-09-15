package com.spring_boot_demo_app.spring_boot_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot_demo_app.spring_boot_demo.LaptopRepository;
import com.spring_boot_demo_app.spring_boot_demo.model.Laptop;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repository;

    public void addLaptop(Laptop laptop) {
        repository.save(laptop);
    }

    public boolean isGoodForProg(Laptop laptop) {
        return true;
    }

}
