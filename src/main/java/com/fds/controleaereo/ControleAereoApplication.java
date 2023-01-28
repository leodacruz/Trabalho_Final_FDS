package com.fds.controleaereo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.fds" })
@EntityScan(basePackages = { "com.fds" })
public class ControleAereoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleAereoApplication.class, args);
	}

}
