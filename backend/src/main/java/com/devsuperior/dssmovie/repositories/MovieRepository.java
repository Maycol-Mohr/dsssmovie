package com.devsuperior.dssmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dssmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
