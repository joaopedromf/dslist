package com.joaopedromf.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaopedromf.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
