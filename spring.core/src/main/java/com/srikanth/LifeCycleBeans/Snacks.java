package com.srikanth.LifeCycleBeans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Snacks implements InitializingBean, DisposableBean {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Snacks() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Snacks [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initializing sancks beans!!");
		
	}
	
	@Override
	public void destroy() throws Exception {
			System.out.println("Destroy sancks beans!!");
	}


}
