package com.example.swapispringbootlab.controller;

import com.example.swapispringbootlab.model.BaseModel;
import com.example.swapispringbootlab.model.PeopleModel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swapispringbootlab.client.interfaces.IStarWarsGateway;

@RestController
@RequestMapping("api/people")
@RequiredArgsConstructor
public class PeopleController {

	private final IStarWarsGateway starWarsGateway;

	@GetMapping
	public BaseModel<PeopleModel> findAll() {
		return this.starWarsGateway.findAllPeople();
	}

}
