package com.srikanth.ci;

public class Person {
	
	private int personId;
	
	private String name;
	
	private Address address;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(int personId, String name, Address address) {
		super();
		this.personId = personId;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" +": "+ this.address.getCity()+  " :  "    +name + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		

}
