package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class CafeConfig {

    @Bean
    @Lazy
    public CoffeeRepository coffeeRepository(){
        return new CoffeeRepository();
    }

}
