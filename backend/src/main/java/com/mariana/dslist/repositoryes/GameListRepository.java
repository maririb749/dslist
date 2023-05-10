package com.mariana.dslist.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.dslist.entities.Game;
import com.mariana.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository <GameList, Long>{

}
