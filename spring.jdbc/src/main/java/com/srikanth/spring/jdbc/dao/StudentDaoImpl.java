package com.srikanth.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.srikanth.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		String query = "insert into Student values(?,?,?)";
		int update = this.jdbcTemplate.update(query, student.getStdId(), student.getName(), student.getAddress());

		return update;
	}

	public int change(Student student) {
		String query = "update student set stdName=?, stdAddress=? where stdId=?";
		int u = this.jdbcTemplate.update(query, student.getName(), student.getAddress(), student.getStdId());
		return u;
	}

	public int delete(int stdId) {
		String query = "delete from student where stdId=?";
		int delete = this.jdbcTemplate.update(query, stdId);
		return delete;
	}

	public Student getStudent(int stdId) {
		String query = "Select * from student where stdId=?";
		RowMapper<Student> mapperImpl = new RowMapperImpl();
//		this.jdbcTemplate.queryFor(query, RowMapper<T>,)
		Student student = this.jdbcTemplate.queryForObject(query, mapperImpl, stdId);
		return student;
	}
	
	public List<Student> getAllStudents() {
		String query = "SELECT * FROM STUDENT";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
