package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.model.Employee;

@SpringBootApplication
public class SpringBootRunnerApplication implements CommandLineRunner{
	@Autowired
	private Employee emp;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRunnerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Employee details "+emp);
		
	}

}
