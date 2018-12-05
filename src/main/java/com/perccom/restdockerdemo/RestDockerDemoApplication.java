package com.perccom.restdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RestDockerDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestDockerDemoApplication.class, args);
	}
}
