package com.lmnader.rhassociation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RhAssociationApplication implements CommandLineRunner {

	@Autowired
	private CustomProperties customProperties;
	public static void main(String[] args) {
		SpringApplication.run(RhAssociationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(customProperties.getApiUrl());
	}
}
