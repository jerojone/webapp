package com.hcm.springboot.springbootHCM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages = "com.spring.webapp.db")
@SpringBootApplication
@ComponentScan("com.*")
public class SpringbootHcmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHcmApplication.class, args);
		
	}

}
