package com.github.yornellas.projectorder.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.yornellas.projectorder.entities.Order;
import com.github.yornellas.projectorder.entities.User;
import com.github.yornellas.projectorder.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> object = repository.findById(id);
		
		return object.get();
	}
}
