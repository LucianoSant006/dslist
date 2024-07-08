package com.LucianoSant.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LucianoSant.dslist.dto.GameMinDTO;
import com.LucianoSant.dslist.entites.Game;
import com.LucianoSant.dslist.repositories.GameRepository;



@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x ->  new GameMinDTO(x)).toList();
		
	}
}
