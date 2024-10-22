package com.srikanth.spring.orm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srikanth.spring.orm.dao.StudentDao;
import com.srikanth.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/srikanth/spring/orm/config.xml");
       StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
       Student student = new Student(100, "raju", "chennai");
       Integer insert = studentDao.insert(student);
       System.out.println("Record is inserted !!"+insert);
    }
}
