package com.aurelius.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.aurelius.employee")
public class SpringEmployeeServiceApplication {

    public static void main(String[] args) {
	SpringApplication.run(SpringEmployeeServiceApplication.class, args);
    }
}
