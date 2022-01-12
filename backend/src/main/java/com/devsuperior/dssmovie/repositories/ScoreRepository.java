package com.devsuperior.dssmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dssmovie.entities.Score;
import com.devsuperior.dssmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
