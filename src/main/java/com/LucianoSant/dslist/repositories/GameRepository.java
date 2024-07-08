package com.LucianoSant.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LucianoSant.dslist.entites.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
