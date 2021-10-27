package com.ronit.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronit.beans.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer>{
//	List<Employees>findByCategoryAndPrice(String Category, double price);

}
