package com.dimitric.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dimitric.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

	
	
}
