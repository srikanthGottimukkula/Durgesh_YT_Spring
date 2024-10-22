package com.srikanth.LifeCycleBeans;

public class Mobile {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [price=" + price + "]";
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {
		System.out.println("inside method init!!!!!!!!");
	}

	public void destory() {
		System.out.println("Inside destroy method!!!");
	}

}
