package com.rcdomingos.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcdomingos.course.entities.Category;
import com.rcdomingos.course.repositories.CategoryRepository;

//registrar como component do spring
//@Component
@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	// serviço para passar para o controlador  
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
