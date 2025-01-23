package com.joaopedromf.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joaopedromf.dslist.dto.GameDTO;
import com.joaopedromf.dslist.dto.GameMinDTO;
import com.joaopedromf.dslist.entities.Game;
import com.joaopedromf.dslist.projections.GameMinProjection;
import com.joaopedromf.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(long gameId){
        Game result = gameRepository.findById(gameId).get();
        return new GameDTO(result);
    }
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
