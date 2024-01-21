package com.devsuperior.DSlist.dto;

import com.devsuperior.DSlist.entities.GameList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
