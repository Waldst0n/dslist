package com.waldston.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waldston.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
