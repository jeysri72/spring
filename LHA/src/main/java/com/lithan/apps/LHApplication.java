package com.lithan.apps;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
 * @SpringBootApplication as our primary application 
 * configuration class; behind the scenes, that's 
 * equivalent to @Configuration, @EnableAutoConfiguration,
 * and @ComponentScan together.
 * 
 */
@EnableJpaRepositories("com.lithan.apps.repository") 
@EntityScan("com.lithan.apps.model")
@SpringBootApplication
public class LHApplication {

	public static void main(String[] args) {
		//run - Static Method
		//Returns ApplicationCotext of the class
		 SpringApplication.run(LHApplication.class, args);
	}

}
