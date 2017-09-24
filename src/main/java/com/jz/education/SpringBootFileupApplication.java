package com.jz.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBootFileupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFileupApplication.class, args);
	}
}
