package com.example.swapispringbootlab.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swapispringbootlab.client.interfaces.IStarWarsGateway;
import com.example.swapispringbootlab.model.PeopleModel;
import com.example.swapispringbootlab.service.interfaces.IPeopleService;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class PeopleService implements IPeopleService{
	
	@Autowired
	IStarWarsGateway starWarsGateway;
	
	@Override
	public List<PeopleModel> findAll() {
		return null;
	}

	@Override
	public PeopleModel findById() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
