package com.srikanth.ref;

public class X {

	private int x;
	private Y y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Y getY() {
		return y;
	}

	public void setY(Y y) {
		this.y = y;
	}

	public X(int x, Y y) {
		super();
		this.x = x;
		this.y = y;
	}

	public X() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "X [x=" + x + "]";
	}

}
