package com.jdbc;

	import java.util.Date;

	public class Employee {
	private int eno;
	private String name;
	private String address;
	private int sal;
	private String designation;
	private int exp;
	private Date doj;
	public Employee() {
	// TODO Auto-generated constructor stub
	}
	public Employee(int eno, String name, String address, int sal, String designation, int exp, Date doj) {
	super();
	this.eno = eno;
	this.name = name;
	this.address = address;
	this.sal = sal;
	this.designation = designation;
	this.exp = exp;
	this.doj = doj;
	}
	public int getEno() {
	return eno;
	}
	public void setEno(int eno) {
	this.eno = eno;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
	this.address = address;
	}
	public int getSal() {
	return sal;
	}
	public void setSal(int sal) {
	this.sal = sal;
	}
	public String getDesignation() {
	return designation;
	}
	public void setDesignation(String designation) {
	this.designation = designation;
	}
	public int getExp() {
	return exp;
	}
	public void setExp(int exp) {
	this.exp = exp;
	}
	public Date getDoj() {
	return doj;
	}
	public void setDoj(Date doj) {
	this.doj = doj;
	}
	}

