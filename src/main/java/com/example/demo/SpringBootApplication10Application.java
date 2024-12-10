package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplication10Application {

    int y=200;

	
	int x = 100;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication10Application.class, args);
	}
	void m2()
	{
		System.out.println("m2 method added");
	}

}
