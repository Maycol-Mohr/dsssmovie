package com.devsuperior.dssmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dssmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
