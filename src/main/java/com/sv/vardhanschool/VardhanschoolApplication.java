package com.sv.vardhanschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.sv.vardhanschool.repository")
@EntityScan("com.sv.vardhanschool.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class VardhanschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(VardhanschoolApplication.class, args);
	}

}
