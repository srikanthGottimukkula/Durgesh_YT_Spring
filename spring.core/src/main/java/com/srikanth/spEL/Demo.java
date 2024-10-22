package com.srikanth.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{10}")
	private int x;

	@Value("#{11}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private double z;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double e;
	
	@Value("#{new java.lang.String('srikanth gmk!!') }")
	private String name;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	public double getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}


	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + "]";
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
