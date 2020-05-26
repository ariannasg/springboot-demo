package com.training.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// the @SpringBootApplication is the trigger for Spring Boot Autoconfiguration.
// using @SpringBootApplication annotation makes this file a configuration file.
// it also makes this file the starting of all our components scanning.
// it also initiates  the auto-configuration capabilities that Spring Boot offers
@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
