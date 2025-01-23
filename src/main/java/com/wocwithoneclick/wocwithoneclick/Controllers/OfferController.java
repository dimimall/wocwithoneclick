package com.wocwithoneclick.wocwithoneclick.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wocwithoneclick.wocwithoneclick.Models.Offer;
import com.wocwithoneclick.wocwithoneclick.Services.OfferServicelmpl;

@RestController
public class OfferController {

	@Autowired
	OfferServicelmpl offerServicelmpl;
	
	@PostMapping("/addoffer") 
	public ResponseEntity<Offer> addOffer(@RequestBody Offer offer) {
		return new ResponseEntity<>(offerServicelmpl.saveOffer(offer), HttpStatus.OK);
	}
	
	@GetMapping("/findofferbyid/{offerId}")
	public ResponseEntity<Optional<Offer>> getOfferById(@PathVariable long offerId){
		return new ResponseEntity<>(offerServicelmpl.getOfferById(offerId), HttpStatus.OK);
	}
	
	@GetMapping("/findofferbyuserid/{userId}")
	public ResponseEntity<List<Offer>> getOfferByUserId(@PathVariable long userId){
		return new ResponseEntity<>(offerServicelmpl.getAllActiveOffersByUser(userId, true), HttpStatus.OK);
	}
	
	@GetMapping("/findactiveoffer/{active}") 
	public ResponseEntity<List<Offer>> getActiveOffers(@PathVariable boolean active){
		return new ResponseEntity<>(offerServicelmpl.getAllActiveOffers(active), HttpStatus.OK);
	}
	
	@PutMapping("/offer/{offerId}")
	public ResponseEntity<Offer> updateOffer(@PathVariable long offerId, @RequestBody Offer offer) {
		return new ResponseEntity<>(offerServicelmpl.updateOffer(offerId, offer), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteoffer/{offerId}")
	public ResponseEntity<Offer> deleteOffer(@PathVariable long offerId) {
		return new ResponseEntity<>(offerServicelmpl.deleteOffer(offerId), HttpStatus.OK);
	}
}
