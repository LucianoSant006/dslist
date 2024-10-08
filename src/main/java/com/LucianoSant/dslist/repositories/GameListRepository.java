<<<<<<< HEAD
package com.LucianoSant.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.LucianoSant.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

    @Modifying
    @Query(nativeQuery = true, 
        value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
    void updateBelongingPosition(@Param("listId") Long listId, 
                                 @Param("gameId") Long gameId, 
                                 @Param("newPosition") Integer newPosition);
}
=======
package com.LucianoSant.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.LucianoSant.dslist.entities.GameList;




public interface GameListRepository extends JpaRepository<GameList, Long> {

	@Modifying
	@Query(nativeQuery = true, 
		value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
	void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
>>>>>>> 7605620059f731f75f0a0bd62c04badb8a908ec8
