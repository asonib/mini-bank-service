package com.bank.accountmgmtservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountMgmtServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMgmtServiceApplication.class, args);
	}

}
