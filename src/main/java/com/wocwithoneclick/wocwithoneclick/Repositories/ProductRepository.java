package com.wocwithoneclick.wocwithoneclick.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wocwithoneclick.wocwithoneclick.Models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query(value = "SELECT * FROM Product WHERE userId = ?1", nativeQuery = true)
	List<Product> getProductsById(long userId);
	
}


