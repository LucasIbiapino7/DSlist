package com.devsuperior.DSlist.services;

import com.devsuperior.DSlist.dto.GameDTO;
import com.devsuperior.DSlist.dto.GameMinDTO;
import com.devsuperior.DSlist.entities.Game;
import com.devsuperior.DSlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;


    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = repository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game game = repository.findById(id).get();
        return new GameDTO(game);
    }
}
