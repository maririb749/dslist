package com.mariana.dslist.repositoryes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mariana.dslist.entities.GameList;
import com.mariana.dslist.projections.GameMinProjection;

public interface GameListRepository extends JpaRepository <GameList, Long>{

	






}
