package com.rcdomingos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcdomingos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
