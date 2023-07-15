package com.apirest.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
