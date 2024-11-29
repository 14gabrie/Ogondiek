package com.example.Document.Management.System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DocumentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentManagementSystemApplication.class, args);
	}

}
