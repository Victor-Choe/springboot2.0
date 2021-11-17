package com.victor.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//부트는 특이하게도 main 함수가 있음. servlet에서는 톰켓에 있었는데 톰켓이 
//포함되어 있기에  main 함수가 확인됨

@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}

}
