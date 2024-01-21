package com.devsuperior.DSlist.services;

import com.devsuperior.DSlist.dto.GameListDTO;
import com.devsuperior.DSlist.entities.GameList;
import com.devsuperior.DSlist.repositories.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ListService {

    @Autowired
    private ListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = repository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
