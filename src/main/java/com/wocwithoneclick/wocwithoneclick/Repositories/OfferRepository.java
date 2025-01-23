package com.wocwithoneclick.wocwithoneclick.Repositories;


import org.springframework.stereotype.Repository;

import com.wocwithoneclick.wocwithoneclick.Models.Offer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

	@Query(value = "SELECT * FROM Offer WHERE userId = ?1 and active = true" , nativeQuery = true)
	List<Offer> getAllActiveOffersByUser(long userId, boolean active);
	
	@Query(value = "SELECT * FROM Offer WHERE active = true", nativeQuery = true)
	List<Offer> getAllActiveOffers(boolean active);
	
	
}
