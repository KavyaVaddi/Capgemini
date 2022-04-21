package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class Demo14Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo14Application.class, args);
		System.out.println("Hello");
	}

}
