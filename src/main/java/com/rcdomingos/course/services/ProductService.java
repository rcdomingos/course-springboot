package com.rcdomingos.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcdomingos.course.entities.Product;
import com.rcdomingos.course.repositories.ProductRepository;

//registrar como component do spring
//@Component
@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	// serviço para passar para o controlador  
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
