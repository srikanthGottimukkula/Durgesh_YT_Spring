package com.srikanth.AutoAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/srikanth/AutoAnnotation/AutoConfig.xml");
		Emp emp = context.getBean("emp",Emp.class);
		System.out.println(emp);
	}
}
