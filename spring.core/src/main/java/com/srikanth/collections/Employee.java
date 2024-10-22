package com.srikanth.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int empId;

	private List<String> phone;

	private Set<String> address;

	private Map<String, String> courses;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Employee(int empId, List<String> phone, Set<String> address, Map<String, String> courses) {
		super();
		this.empId = empId;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", phone=" + phone + ", address=" + address + ", courses=" + courses + "]";
	}

}
