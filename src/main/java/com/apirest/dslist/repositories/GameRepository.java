package com.apirest.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long >{

}
