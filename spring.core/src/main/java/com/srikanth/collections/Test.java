package com.srikanth.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srikanth/collections/CollectionConfig.xml");
		Employee bean = (Employee) context.getBean("empObj");
		System.out.println("set of values : " + bean.getAddress());
		System.out.println("Map of key and values : " + bean.getCourses());
		System.out.println("List of values data : " + bean.getPhone());
	}

}
