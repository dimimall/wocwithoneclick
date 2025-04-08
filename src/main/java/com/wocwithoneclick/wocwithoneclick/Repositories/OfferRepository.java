package com.wocwithoneclick.wocwithoneclick.Repositories;


import org.springframework.stereotype.Repository;

import com.wocwithoneclick.wocwithoneclick.Models.Offer;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface OfferRepository extends CrudRepository<Offer, Long> {

	@Query(value = "SELECT * FROM Offer WHERE userId = ?1 and active = true")
	List<Offer> getAllActiveOffersByUser(long userId, boolean active);
	
	@Query(value = "SELECT * FROM Offer WHERE active = true")
	List<Offer> getAllActiveOffers(boolean active);
	
	
}
