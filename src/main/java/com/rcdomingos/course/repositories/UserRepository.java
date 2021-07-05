package com.rcdomingos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcdomingos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
