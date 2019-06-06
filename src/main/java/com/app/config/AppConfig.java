package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.model.Employee;

@Configuration
public class AppConfig {

	@Bean
	public Employee emp() {
		Employee e=new Employee();
		e.setEmpId(434);
		e.setEmpName("Balaraju");
		e.setEmpSal(345.67);
		return e;
	}
}
