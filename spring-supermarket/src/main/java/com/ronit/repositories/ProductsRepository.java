package com.ronit.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronit.beans.Products;

@Repository
public interface ProductsRepository  extends JpaRepository<Products, Integer> {
//List<Products>findByCategoryAndPrice(String Category, double price);
	
	Products findById(int id);
}
