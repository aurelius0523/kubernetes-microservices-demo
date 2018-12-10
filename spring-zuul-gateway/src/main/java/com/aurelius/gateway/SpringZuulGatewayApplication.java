package com.aurelius.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.aurelius.gateway.config.GatewayConfiguration;

@ComponentScan(basePackages = { "com.aurelius.gateway" })
@SpringBootApplication
@Import({ GatewayConfiguration.class })
public class SpringZuulGatewayApplication {

    public static void main(String[] args) {
	SpringApplication.run(SpringZuulGatewayApplication.class, args);
    }
}
