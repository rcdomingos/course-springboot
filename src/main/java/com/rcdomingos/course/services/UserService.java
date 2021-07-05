package com.rcdomingos.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcdomingos.course.entities.User;
import com.rcdomingos.course.repositories.UserRepository;

//registrar como component do spring
//@Component
@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	// serviço para passar para o controlador  
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
