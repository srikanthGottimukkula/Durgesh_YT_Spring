package com.srikanth.spring.jdbc;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srikanth.spring.jdbc.dao.StudentDao;
import com.srikanth.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/srikanth/spring/jdbc/config.xml");/
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//		Student student = new Student();
//		student.setStdId(200);
//		student.setName("srikrsihna");
//		student.setAddress("Hyderabad");
//		int result = studentDao.insert(student);
//		System.out.println("The no of rows effected created  !!!" + result);

		//update
//		Student student = new Student();
//		student.setStdId(100);
//		student.setName("karthik");
//		student.setAddress("usa");
//		int updated = studentDao.change(student);
//		System.out.println("The no of rows updated!!!" + updated);
		
		//delete
//
//		int updated = studentDao.delete(200);
//		System.out.println(updated+"deletd!!");
		
		//SELECT 
//		Student student = studentDao.getStudent(100);
//		System.out.println(student);
		
		//Get All Students
		List<Student> allStudents = studentDao.getAllStudents();
		allStudents.stream().forEach(System.out::println);
//		for(Student s : allStudents) {
//			System.out.println(s);
//		}

	}

	
}
