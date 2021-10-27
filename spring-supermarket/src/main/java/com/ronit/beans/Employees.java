package com.ronit.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String position;
	private int passcode;

	public Employees() {

	}

	public Employees(String name, String position) {
		this.name = name;
		this.position = position;
		this.passcode = (int) (Math.random() * 1001);
	}

	public Employees(int id, String name, String position) {
		this(name, position);
		this.id = id;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getPasscode() {
		return passcode;
	}

	public void setPasscode(int passcode) {
		this.passcode = passcode;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", position=" + position + ", passcode=" + passcode + "]";
	}

}
