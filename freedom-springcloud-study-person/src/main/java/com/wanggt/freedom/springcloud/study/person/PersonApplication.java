package com.wanggt.freedom.springcloud.study.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PersonApplication {

	public static void main(String[] args) {
		//注释
		SpringApplication.run(PersonApplication.class, args);
	}
}
