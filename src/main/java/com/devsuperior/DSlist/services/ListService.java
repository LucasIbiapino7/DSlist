package com.devsuperior.DSlist.services;

import com.devsuperior.DSlist.dto.GameListDTO;
import com.devsuperior.DSlist.entities.GameList;
import com.devsuperior.DSlist.projections.GameMinProjection;
import com.devsuperior.DSlist.repositories.GameRepository;
import com.devsuperior.DSlist.repositories.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ListService {

    @Autowired
    private ListRepository repository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = repository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> result = gameRepository.searchGamesByList(listId);

        GameMinProjection obj = result.remove(sourceIndex);
        result.add(destinationIndex, obj);

        int min = Math.min(sourceIndex, destinationIndex);
        int max = Math.max(sourceIndex, destinationIndex);

        for (int i = min; i <= max; i++){
            gameRepository.updateBelongingPosition(listId, result.get(i).getId(), i);
        }

    }

}
