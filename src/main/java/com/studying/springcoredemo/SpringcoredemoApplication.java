package com.studying.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// to scan other packages outside this package
@SpringBootApplication
(scanBasePackages = {"com.studying.springcoredemo","untiltest"})



public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
