package com.srikanth.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/srikanth/ref/RefConfig.xml");
		X xObj  = (X)context.getBean("refX");
		System.out.println(xObj.getX());
		System.out.println(xObj.getY());
//		System.out.println(xObj.());
	}
}
