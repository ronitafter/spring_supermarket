package com.ronit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronit.beans.Coupons;

@Repository
public interface CouponsRepository extends JpaRepository<Coupons, Integer> {
//	List<Coupons>findByCategoryAndPrice(String name, int code);
	Coupons findById(int id);
	List <Coupons> findByDiscount( int discount);
	List <Coupons> findByDiscountAndName(String name, int discount);
	List <Coupons> findByDiscountGreaterThan(int discount);
	List <Coupons> findByDiscountLessThan(int discount);




}
