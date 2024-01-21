package com.devsuperior.DSlist.controllers;

import com.devsuperior.DSlist.dto.GameListDTO;
import com.devsuperior.DSlist.services.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class ListController {

    @Autowired
    private ListService service;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll(){
        List<GameListDTO> dto = service.findAll();
        return ResponseEntity.ok(dto);
    }

}
