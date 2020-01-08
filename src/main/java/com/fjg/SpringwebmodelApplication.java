package com.fjg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.fjg.dao")
@SpringBootApplication(scanBasePackages= {"com.fjg.base","com.fjg.controller","com.fjg.model","com.fjg.service"})
public class SpringwebmodelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebmodelApplication.class, args);
	}

}
