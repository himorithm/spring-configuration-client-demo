package com.himanshu.configClient.configClientDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ConfigClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientDemoApplication.class, args);
	}

}

