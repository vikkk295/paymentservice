package com.example.payservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PayserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayserviceApplication.class, args);
	}

}
