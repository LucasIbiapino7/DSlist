package com.devsuperior.DSlist.dto;

import com.devsuperior.DSlist.entities.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GameMinDTO {

    private Long id;
    private String title;
    private String imgUrl;
    private String shortDescription;
    private Integer year;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        year = entity.getYear();
    }
}
