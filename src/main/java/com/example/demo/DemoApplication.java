package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Notice the Change");
        System.out.println("Change in main");
        System.out.println("Change in Develop");
        System.out.println("Again added in Develop");
        SpringApplication.run(DemoApplication.class, args);
    }

}
