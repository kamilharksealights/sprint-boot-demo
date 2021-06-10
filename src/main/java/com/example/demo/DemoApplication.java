package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URL;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		URL resource = DemoApplication.class.getResource("/buildSessionId.txt");
		System.out.println(resource);
		SpringApplication.run(DemoApplication.class, args);
	}

}
