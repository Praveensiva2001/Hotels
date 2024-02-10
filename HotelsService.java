package com.tamilnadu.hotels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamilnadu.hotels.modal.RequestModal;
import com.tamilnadu.hotels.modal.Restaurants;
import com.tamilnadu.hotels.repository.HotelsRepository;

@Service
public class HotelsService implements HotelsServiceInterface{
	
	@Autowired
    private HotelsRepository hotelsRepository;
	
//	 @PersistenceContext
//	    EntityManager entityManager;
//	
//	 @Transactional
//	public void addIdColumn() {
//        String sql = "ALTER TABLE restaurants ADD COLUMN id INT AUTO_INCREMENT PRIMARY KEY FIRST";
//        entityManager.createNativeQuery(sql).executeUpdate();
//    }

	public List<Restaurants> getAllRestaurantsInIndia() {
		return hotelsRepository.findAll();
	}
	
	public List<Restaurants> getAllRestaurantsByRatings(String ratings) {
		return hotelsRepository.findByRating(ratings);
	}
	
	public List<Restaurants> registerRestaurant(RequestModal requestModal) {
		Restaurants restaurants = requestModal.getRestaurants();
		hotelsRepository.save(restaurants);
		return getAllRestaurantsInIndia();
	}
	
	public List<Restaurants> deleteRestaurantById(int id) {
		hotelsRepository.deleteById(id);
		return getAllRestaurantsInIndia();
	}

	@Override
	public List<Restaurants> getRestaurantsByCity(String city) {
		return hotelsRepository.findByCity(city);
	}
}
