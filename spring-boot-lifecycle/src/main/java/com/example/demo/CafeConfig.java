package com.example.demo;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CafeConfig {

    @Bean
    public CoffeeRepository coffeeRepository(){
        return new CoffeeRepository();
    }


}
