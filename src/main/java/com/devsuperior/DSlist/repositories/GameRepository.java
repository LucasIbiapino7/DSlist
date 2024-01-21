package com.devsuperior.DSlist.repositories;

import com.devsuperior.DSlist.entities.Game;
import com.devsuperior.DSlist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {


    @Query(nativeQuery = true, value = "SELECT tb_game.id, tb_game.title, tb_game.img_url AS imgUrl,  tb_game.short_description AS shortDescription, tb_game.game_year AS gameYear, tb_belonging.position " +
            "FROM tb_belonging " +
            "INNER JOIN tb_game_list ON  tb_game_list.id = tb_belonging.list_id " +
            "INNER JOIN tb_game ON tb_game.id = tb_belonging.game_id " +
            "WHERE tb_game_list.id = :listId")
    List<GameMinProjection> searchGamesByList(Long listId);

}
