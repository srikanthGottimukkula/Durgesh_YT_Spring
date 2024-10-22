package com.srikanth.standAlone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MianTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srikanth/standAlone/AloneConfig.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
	}
}
