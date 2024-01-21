package com.devsuperior.DSlist.controllers;

import com.devsuperior.DSlist.dto.GameMinDTO;
import com.devsuperior.DSlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> helloWorld(){
        List<GameMinDTO> result = service.findAll();
        return ResponseEntity.ok(result);
    }

}
