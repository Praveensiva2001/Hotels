package com.tamilnadu.hotels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamilnadu.hotels.modal.Restaurants;

public interface HotelsRepository extends JpaRepository<Restaurants, Integer>{

	List<Restaurants> findByRating(String ratings);

	List<Restaurants> findByCity(String city);

}
