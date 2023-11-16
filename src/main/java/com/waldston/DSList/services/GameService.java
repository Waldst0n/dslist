package com.waldston.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.waldston.dslist.dto.GameDTO;
import com.waldston.dslist.dto.GameMinDTO;
import com.waldston.dslist.entities.Game;
import com.waldston.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		
		return dto;
		
	}
	
	public List<GameMinDTO> findAll() {
		var result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		
	}
	

	
	
	
}
