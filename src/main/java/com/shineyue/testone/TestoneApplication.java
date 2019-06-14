package com.shineyue.testone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shineyue.testone.mapper")
public class TestoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestoneApplication.class, args);
	}

}
