package com.srikanth.ci;

public class Addition {

	private int a;

	private int b;

	public Addition(int a, int b) {
		super();
		System.out.println("int" + ":" + "int");
		this.a = a;
		this.b = b;
	}

	public Addition(double a, double b) {
		super();
		System.out.println("double" + ":" + "double");
		this.a = (int) a;
		this.b = (int) b;
	}
	
	public Addition(String a, String b) {
		super();
		System.out.println("String" + ":" + "String");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

	public void doSum() {
		System.out.println("a value is :" + this.a+ ":"+"b value is :" +this.b);
		System.out.println(this.a + this.b);
	}

	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}

}
