package com.tamilnadu.hotels.modal;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class RequestModal {
	@Autowired
	private Restaurants restaurants;
	
	
}
