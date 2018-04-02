package com.seguritech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CadCatalogoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadCatalogoApplication.class, args);
	}
}
