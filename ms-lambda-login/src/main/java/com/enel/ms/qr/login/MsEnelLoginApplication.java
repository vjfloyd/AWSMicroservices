package com.enel.ms.qr.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class MsEnelLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEnelLoginApplication.class, args);
	}
}
