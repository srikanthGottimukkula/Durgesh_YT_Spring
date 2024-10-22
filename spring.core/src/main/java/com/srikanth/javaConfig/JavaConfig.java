package com.srikanth.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.srikanth.javaConfig")
public class JavaConfig {

	@Bean
	public Employee getEmp() {
		Employee emp = new Employee();
		return emp;

	}

}
