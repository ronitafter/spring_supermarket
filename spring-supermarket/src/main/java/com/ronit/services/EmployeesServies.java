package com.ronit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronit.beans.Coupons;
import com.ronit.beans.Customers;
import com.ronit.beans.Products;
import com.ronit.repositories.CouponsRepository;
import com.ronit.repositories.CustomersRepository;
import com.ronit.repositories.ProductsRepository;

@Service
public class EmployeesServies {

	private ProductsRepository productsrepository;
	private CouponsRepository couponsrepository;
	private CustomersRepository customersrepository;

	@Autowired
	public EmployeesServies(ProductsRepository productsrepository, CustomersRepository customersrepository,
			CouponsRepository couponsrepository) {
		this.couponsrepository = couponsrepository;
		this.productsrepository = productsrepository;
		this.customersrepository = customersrepository;

	}

	public Integer getDiscountByCode(int code) {
		Coupons coupon = couponsrepository.findById(code);
		if (coupon != null) {
			return coupon.getDiscount();
		}
		return null;

	}

	public void addNewCustomer(Customers customer) {

		customersrepository.save(customer);
	}

	public void addNewProduct(Products product) {

		productsrepository.save(product);
	}

}
