<<<<<<< HEAD
package com.LucianoSant.dslist.dto;

import com.LucianoSant.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
=======
package com.LucianoSant.dslist.dto;

import com.LucianoSant.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
>>>>>>> 7605620059f731f75f0a0bd62c04badb8a908ec8
