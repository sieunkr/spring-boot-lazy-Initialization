package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class CoffeeRepository implements InitializingBean, DisposableBean {

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

    @PostConstruct
    public void init(){
        System.out.println("PostConstruct annotation");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }


}
