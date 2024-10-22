package com.srikanth.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.srikanth.spring.jdbc.entities.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std = new Student();
		std.setStdId(rs.getInt(1));
		std.setName(rs.getString(2));
		std.setAddress(rs.getString(3));
		return std;
	}

}
