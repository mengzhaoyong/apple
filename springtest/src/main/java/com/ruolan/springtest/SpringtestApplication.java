package com.ruolan.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//这个注解  会全package的扫描
@SpringBootApplication
public class SpringtestApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringtestApplication.class, args);
	}
}
