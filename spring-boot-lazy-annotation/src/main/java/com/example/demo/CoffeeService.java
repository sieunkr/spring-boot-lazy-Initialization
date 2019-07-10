package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    @Lazy
    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public String findAll(){
        return coffeeRepository.findAll();
    }

}
