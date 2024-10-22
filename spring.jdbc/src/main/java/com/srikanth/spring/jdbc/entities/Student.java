package com.srikanth.spring.jdbc.entities;

public class Student {

	private int stdId;

	private String name;

	private String address;

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int stdId, String name, String address) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", address=" + address + "]";
	}

}
