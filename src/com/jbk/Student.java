package com.jbk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private long reg_No;
	private String name;
	private int age;
	private String email;
	private String address;

	public Student() {

	}

	public Student(long reg_No, String name, int age, String email, String address) {
		super();
		this.reg_No = reg_No;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public long getReg_No() {
		return reg_No;
	}

	public void setReg_No(long reg_No) {
		this.reg_No = reg_No;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [reg_No=" + reg_No + ", name=" + name + ", age=" + age + ", email=" + email + ", address="
				+ address + "]";
	}

}
