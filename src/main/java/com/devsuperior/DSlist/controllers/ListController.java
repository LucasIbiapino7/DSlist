package com.devsuperior.DSlist.controllers;

import com.devsuperior.DSlist.dto.GameListDTO;
import com.devsuperior.DSlist.dto.GameMinDTO;
import com.devsuperior.DSlist.dto.ReplacementDTO;
import com.devsuperior.DSlist.services.GameService;
import com.devsuperior.DSlist.services.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class ListController {

    @Autowired
    private ListService service;

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll(){
        List<GameListDTO> dto = service.findAll();
        return ResponseEntity.ok(dto);
    }

    @GetMapping(value = "/{listId}/games")
    public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return ResponseEntity.ok(result);
    }

    @PostMapping(value = "/{listId}/replacement")
    public ResponseEntity<Void> move(@PathVariable Long listId, @RequestBody ReplacementDTO dto){
        service.move(listId, dto.getSourceIndex(), dto.getDestinationIndex());
        return ResponseEntity.ok().build();
    }


}
