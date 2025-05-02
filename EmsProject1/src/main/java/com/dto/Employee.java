package com.dto;

import java.security.PrivateKey;

public class Employee {
	private int id;
	private String name;
	private double salary ;
	private String mobile;
	private String email;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, String mobile, String email) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mobile = mobile;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mobile=" + mobile + ", email="
				+ email + "]";
	}
	
	
	

}
