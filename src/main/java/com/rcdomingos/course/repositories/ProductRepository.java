package com.rcdomingos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcdomingos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
