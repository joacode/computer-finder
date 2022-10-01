package com.computerFinder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.computerFinder")
public class ComputerFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputerFinderApplication.class, args);
	}

}
