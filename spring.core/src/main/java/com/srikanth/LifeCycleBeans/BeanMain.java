package com.srikanth.LifeCycleBeans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srikanth/LifeCycleBeans/BeansConfig.xml");
		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("com/srikanth/LifeCycleBeans/BeansConfig.xml");
//		Mobile mobile = (Mobile) context.getBean("LG");
//		System.out.println(mobile);
		context.registerShutdownHook();
//
//		System.out.println("******************************");
//		Snacks snacks = (Snacks) context.getBean("sn");
//		System.out.println(snacks);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Product product = (Product) context.getBean("pd");
		System.out.println(product);

	}

}
