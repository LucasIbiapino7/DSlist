package com.devsuperior.DSlist.repositories;

import com.devsuperior.DSlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
