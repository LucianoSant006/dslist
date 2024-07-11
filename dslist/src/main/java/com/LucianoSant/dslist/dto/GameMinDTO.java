package com.LucianoSant.dslist.dto;

import com.LucianoSant.dslist.entites.Game;
import com.LucianoSant.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameMinDTO() {
		
		
	}

	public GameMinDTO(Game  entity) {
		 
		
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
		longDescription = entity.getLongDescription();
				}
	

	public GameMinDTO(GameMinProjection  projection) {
		 
		
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
		
				}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}
	
	
	
	
	
}
