package com.ronit;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ronit.beans.Coupons;
import com.ronit.beans.Products;
import com.ronit.repositories.CouponsRepository;
import com.ronit.repositories.ProductsRepository;

@SpringBootApplication
public class Super {

	public static void main(String[] args) {
		ApplicationContext Context = SpringApplication.run(Super.class);
		ProductsRepository productsrepository = Context.getBean(ProductsRepository.class);
		CouponsRepository couponsrepository = Context.getBean(CouponsRepository.class);
//		productsrepository.save(new Products("Sushi", 50.0, "Food"));
//		productsrepository.save(new Products("Water", 10.0, "Drinks"));
//		productsrepository.save(new Products("Chocolate", 15.0, "Sweets"));
//		productsrepository.save(new Products("Salad", 30.0, "Food"));
//		productsrepository.save(new Products("Coffee", 15.0, "Drinka"));
//		productsrepository.save(new Products("Candy", 105.0, "Sweets"));
		couponsrepository.save(new Coupons("Coffee Coupon", 0));
		System.out.println(couponsrepository.findByDiscount(0));

	}

}
