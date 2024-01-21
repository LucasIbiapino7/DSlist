package com.devsuperior.DSlist.services;

import com.devsuperior.DSlist.dto.GameMinDTO;
import com.devsuperior.DSlist.entities.Game;
import com.devsuperior.DSlist.repositories.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional
    public List<GameMinDTO> findAll(){
        List<Game> result = repository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
