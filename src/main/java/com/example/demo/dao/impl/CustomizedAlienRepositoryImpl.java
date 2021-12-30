package com.example.demo.dao.impl;

import com.example.demo.dao.CustomizedAlienRepository;
import com.example.demo.model.Alien;

public class CustomizedAlienRepositoryImpl implements CustomizedAlienRepository {

	public void customMethod(Alien alien) {
		System.out.println("Inside alien, name" +alien.getAname());
	}
	
}
