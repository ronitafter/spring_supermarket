package com.ronit.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Coupons")
public class Coupons {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;
	private String name;
	private int discount;
	
	
	public Coupons() {

	}
	
	public Coupons(String name, int discount) {
		this.name = name;
		this.discount = discount;
	}

	
	public Coupons(int code, String name, int discount) {
		this.code = code;
		this.name = name;
		this.discount = discount;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Coupons [code=" + code + ", name=" + name + ", discount=" + discount + "]";
	}
	
	
	
	
	
}
