package com.personal.emailclient;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.sql.DataSource;

@SpringBootApplication
public class EmailClientApplication {


	public static void main(String[] args) {
		SpringApplication.run(EmailClientApplication.class, args);
	}
}
