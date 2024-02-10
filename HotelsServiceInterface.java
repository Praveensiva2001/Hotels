package com.tamilnadu.hotels.service;

import java.util.List;

import com.tamilnadu.hotels.modal.RequestModal;
import com.tamilnadu.hotels.modal.Restaurants;

public interface HotelsServiceInterface {
	List<Restaurants> getAllRestaurantsInIndia();
	
	List<Restaurants> getAllRestaurantsByRatings(String ratings);
	
	List<Restaurants> registerRestaurant(RequestModal requestModal);
	
	List<Restaurants> deleteRestaurantById(int id);
	
	List<Restaurants> getRestaurantsByCity(String city);
}
