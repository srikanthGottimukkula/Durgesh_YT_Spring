package com.srikanth.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Student bean = (Student)context.getBean("studentObject");
		Student bean1 = (Student)context.getBean("studentObject1");
		System.out.println(bean);
		System.out.println(bean1);
	}
}
