package com.klinnovations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SbmsAdminServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsAdminServerAppApplication.class, args);
	}

}
