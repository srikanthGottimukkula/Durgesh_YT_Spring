package com.srikanth.spring.jdbc.dao;

import java.util.List;

import com.srikanth.spring.jdbc.entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(int stdId);
	
	public Student getStudent(int stdId);
	
	public List<Student> getAllStudents();

}
