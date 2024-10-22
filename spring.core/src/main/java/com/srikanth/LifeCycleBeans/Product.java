package com.srikanth.LifeCycleBeans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Product {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("starting the method!!");
	}

	@PreDestroy
	public void ending() {
		System.out.println("ending the method!!");
	}

}
