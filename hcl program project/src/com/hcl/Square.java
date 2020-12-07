package com.hcl;


public class Square  {
	public double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double calcPeri() {
		return 4 * this.side;
	}

	public double calcArea() {
		return this.side * this.side;
	}

}


