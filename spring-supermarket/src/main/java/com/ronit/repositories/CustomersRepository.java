package com.ronit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronit.beans.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer>{
//	List< Customers>findByCategoryAndPrice(String name, int age);

}
