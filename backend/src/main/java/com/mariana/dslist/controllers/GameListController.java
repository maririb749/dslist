package com.mariana.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mariana.dslist.DTO.GameListDTO;
import com.mariana.dslist.DTO.GameMinDTO;
import com.mariana.dslist.service.GameListService;
import com.mariana.dslist.service.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO>findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
		
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO>findByList(@PathVariable long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
		
	}

}
