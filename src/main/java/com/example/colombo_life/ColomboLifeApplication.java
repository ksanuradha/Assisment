package com.example.colombo_life;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ColomboLifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColomboLifeApplication.class, args);
	}
}
