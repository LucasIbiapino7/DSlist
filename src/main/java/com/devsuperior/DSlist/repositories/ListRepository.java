package com.devsuperior.DSlist.repositories;

import com.devsuperior.DSlist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<GameList, Long> {
}
