package com.tamilnadu.hotels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tamilnadu.hotels.modal.RequestModal;
import com.tamilnadu.hotels.modal.Restaurants;
import com.tamilnadu.hotels.service.HotelsService;

@RestController
public class HotelsController {
	
	@Autowired
	private HotelsService service;
	
	@GetMapping("/getallrestaurants")
	public List<Restaurants> getAllRestaurants() {
//		service.addIdColumn();
		return service.getAllRestaurantsInIndia();
	}
	
	@GetMapping("/getAllRestaurantsByRatings/{ratings}")
//	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<Restaurants> getAllRestaurantsByRatingsController(@PathVariable String ratings) {
		return service.getAllRestaurantsByRatings(ratings);
	}
	
	@PostMapping("/registerRestaurant")
	public List<Restaurants> registerRestaurant(@RequestBody RequestModal requestModal) {
		return service.registerRestaurant(requestModal);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public List<Restaurants> deleteRestaurantById(@PathVariable int id) {
		return service.deleteRestaurantById(id);
	}
	
	@GetMapping("/getAllRestaurantsByCity/{city}")
//	@PreAuthorize("hasAuthority('ROLE_USER')")
	public List<Restaurants> getRestaurantsByCity(@PathVariable String city){
		return service.getRestaurantsByCity(city);
	}
}
