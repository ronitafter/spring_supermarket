package com.ronit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronit.beans.Coupons;
import com.ronit.beans.Employees;
import com.ronit.beans.Products;
import com.ronit.repositories.CouponsRepository;
import com.ronit.repositories.CustomersRepository;
import com.ronit.repositories.EmployeesRepository;
import com.ronit.repositories.ProductsRepository;

@Service
public class ManagerService {

	private EmployeesRepository employeesrepository;
	private CouponsRepository couponsrepository;


	@Autowired
	public ManagerService(EmployeesRepository employeesrepository,
			CouponsRepository couponsrepository) {
		this.couponsrepository = couponsrepository;
		this.employeesrepository = employeesrepository;

	}

	public void addCoupon(Coupons coupon) {
		couponsrepository.save(coupon);
	}
	
	public void addEmployee(Employees Employee) {
		employeesrepository.save(Employee);
	}

	public List<Coupons> getAllCoupons(){
		return couponsrepository.findAll();
		
	}
	
	public List<Employees> getAllEmployees(){
		return employeesrepository.findAll();
		
	}
	



}
