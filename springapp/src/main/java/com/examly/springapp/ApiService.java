package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {
    private final List<Laptop> laptops = new ArrayList<>();

    public boolean addLaptop(Laptop laptop) {
        return laptops.add(laptop);
    }

    public Laptop getLaptopById(int laptopId) {
        // Find and return laptop by ID
        // Implement your logic here
        return null;
    }

    public List<Laptop> getAllLaptops() {
        return laptops;
    }
}
