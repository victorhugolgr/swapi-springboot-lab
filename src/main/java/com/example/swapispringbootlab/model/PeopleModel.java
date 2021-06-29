package com.example.swapispringbootlab.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.*;

@Data
public class PeopleModel {
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("height")
	private double height;
	
	@JsonProperty("mass")
	private int mass;
	
	@JsonProperty("hair_color")
	private String hairColor;
	
	@JsonProperty("skin_color")
	private String skinColor;
	
	@JsonProperty("eye_color")
	private String eyeColor;
	
	@JsonProperty("birth_year")
	private String birthYear;
	
	@JsonProperty("gender")
	private String gender;
	
	@JsonProperty("films")
	private List<String> films;
	
}
