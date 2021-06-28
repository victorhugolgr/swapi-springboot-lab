package com.example.swapispringbootlab.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseModel {
	
	private LocalDateTime created;
	private LocalDateTime edited;
	private String url;
}
