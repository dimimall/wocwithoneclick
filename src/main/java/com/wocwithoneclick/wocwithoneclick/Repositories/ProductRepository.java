package com.wocwithoneclick.wocwithoneclick.Repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wocwithoneclick.wocwithoneclick.Models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	@Query(value = "SELECT * FROM Product WHERE userId = ?1")
	List<Product> getProductsById(long userId);
	
}


