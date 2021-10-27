package com.ronit.beans;

import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int age;
	@Column(name = "name")
	private String name;
	private String password;
	
	public Customers() {
		
	}
	public Customers(int age, String name, String password) {
		this.age = age;
		this.name = name;
		this.password = password;
	}
	public Customers(int id, int age, String name, String password) {
		this(age, name, password);
		this.id = id;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customers [id=" + id + ", age=" + age + ", name=" + name + ", password=" + password + "]";
	}
	
	

	

}
