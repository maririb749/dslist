package com.mariana.dslist.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.dslist.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long>{

}
