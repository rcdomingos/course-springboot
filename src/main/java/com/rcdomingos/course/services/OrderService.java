package com.rcdomingos.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcdomingos.course.entities.Order;
import com.rcdomingos.course.repositories.OrderRepository;

//registrar como component do spring
//@Component
@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	// serviço para passar para o controlador  
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
