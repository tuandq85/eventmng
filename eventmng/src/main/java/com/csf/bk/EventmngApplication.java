package com.csf.bk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EventmngApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventmngApplication.class, args);
	}

}

