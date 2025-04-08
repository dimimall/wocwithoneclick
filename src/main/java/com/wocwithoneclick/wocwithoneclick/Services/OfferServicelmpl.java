package com.wocwithoneclick.wocwithoneclick.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wocwithoneclick.wocwithoneclick.Models.Offer;
import com.wocwithoneclick.wocwithoneclick.Repositories.OfferRepository;


@Service
public class OfferServicelmpl{

	@Autowired
	private OfferRepository offerRepository;
	
	public Offer saveOffer(Offer offer) {
		return offerRepository.save(offer);
	}
	
	public List<Offer> getAllOffers() {
		return (List<Offer>) offerRepository.findAll();
	}
	
	public List<Offer> getAllActiveOffersByUser(long userId, boolean active){
		return offerRepository.getAllActiveOffersByUser(userId, active);
	}
	
	public List<Offer> getAllActiveOffers(boolean active){
		return offerRepository.getAllActiveOffers(active);
	}
	
	public Optional<Offer> getOfferById(long offerId) {
		return offerRepository.findById(offerId);
	}
	
	public Offer updateOffer(long offerId, Offer offer) {
		Offer existingOffer = offerRepository.findById(offerId).orElseThrow(() -> new RuntimeException("Not Found"));
		existingOffer.setOfferId(offer.getOfferId());
		existingOffer.setUserId(offer.getUserId());
		existingOffer.setTitle(offer.getTitle());
		existingOffer.setActive(offer.isActive());
		existingOffer.setBase64Offer(offer.getBase64Offer());
		existingOffer.setDescription(offer.getDescription());
		offerRepository.save(existingOffer);
		return existingOffer;
	}
	
	public Offer deleteOffer(long offerId) {
		Offer existingOffer = offerRepository.findById(offerId).orElseThrow(() -> new RuntimeException("Not Found"));
		offerRepository.deleteById(offerId);
	    return existingOffer;
	}
}
