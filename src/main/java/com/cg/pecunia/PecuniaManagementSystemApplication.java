package com.cg.pecunia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PecuniaManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PecuniaManagementSystemApplication.class, args);
	}

}
