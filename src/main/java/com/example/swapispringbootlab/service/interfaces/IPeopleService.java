package com.example.swapispringbootlab.service.interfaces;

import java.util.List;

import com.example.swapispringbootlab.model.PeopleModel;

public interface IPeopleService {
	
	List<PeopleModel> findAll();
	
	PeopleModel findById();
	
}
