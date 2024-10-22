package springmvcsearch.model;

import java.util.List;

public class Student {

	private String name;

	private int id;

	private String date;

	private List<String> subjects;

	private String gender;

	private String type;

	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", date=" + date + ", subjects=" + subjects + ", gender="
				+ gender + ", type=" + type + ", address=" + address + "]";
	}


}
