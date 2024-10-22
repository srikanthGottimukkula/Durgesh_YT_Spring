package com.srikanth.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/srikanth/ci/ConstInjConfig.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		
		Addition addition = (Addition) context.getBean("adition");
//		System.out.println();
		addition.doSum();
	}
	

}
