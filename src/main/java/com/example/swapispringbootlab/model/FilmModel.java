package com.example.swapispringbootlab.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FilmModel extends BaseModel {

	private String title;
	private Long episodeId;
	private String openingCrawl;
	private String director;
	private String producer;
	private LocalDate releaseDate;
	
	
}
