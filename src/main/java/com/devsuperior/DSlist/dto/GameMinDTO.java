package com.devsuperior.DSlist.dto;

import com.devsuperior.DSlist.entities.Game;
import com.devsuperior.DSlist.projections.GameMinProjection;
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
    private Integer position;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        year = entity.getYear();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
        year = projection.getGameYear();
        position = projection.getPosition();
    }

}
