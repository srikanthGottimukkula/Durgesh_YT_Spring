package com.srikanth.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee employee = context.getBean("getEmp",Employee.class);
//		System.out.println(employee.demo());
		employee.demo();
		
	}

	

}
