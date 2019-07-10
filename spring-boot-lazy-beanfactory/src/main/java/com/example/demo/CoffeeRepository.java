package com.example.demo;

public class CoffeeRepository {

    public CoffeeRepository(){

        System.out.println("coffeeRepository bean init");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String findAll(){
        return "coffee-all";
    }

}
