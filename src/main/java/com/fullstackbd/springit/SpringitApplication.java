package com.fullstackbd.springit;
/*
	/{name}
	POJO func(@PathVariable("name") String name) {
		return // construct the class
	}
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class SpringitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

}
