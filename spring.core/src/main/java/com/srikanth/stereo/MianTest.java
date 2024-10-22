package com.srikanth.stereo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MianTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srikanth/stereo/StereoConfig.xml");
		Student student = context.getBean("obj", Student.class);
		System.out.println(student);

		System.out.println(student.hashCode());
		System.out.println(student.hashCode());
		Teacher teacher = context.getBean("teacher",Teacher.class);
		Teacher teacher1 = context.getBean("teacher",Teacher.class);
		System.out.println(teacher.hashCode());
		System.out.println(teacher1.hashCode());
		
		
		
	}
}
