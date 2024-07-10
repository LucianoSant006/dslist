package com.LucianoSant.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LucianoSant.dslist.dto.GameDTO;
import com.LucianoSant.dslist.dto.GameListDTO;
import com.LucianoSant.dslist.dto.GameMinDTO;
import com.LucianoSant.dslist.entites.Game;
import com.LucianoSant.dslist.services.GameListService;
import com.LucianoSant.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
}
