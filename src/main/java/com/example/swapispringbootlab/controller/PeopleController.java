package com.example.swapispringbootlab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swapispringbootlab.client.interfaces.IStarWarsGateway;
import com.example.swapispringbootlab.model.PeopleModel;

@RestController
@RequestMapping("api/people")
public class PeopleController {

	@Autowired
	IStarWarsGateway starWarsGateway;

	@GetMapping
	public ResponseEntity<List<PeopleModel>> findAll() {
		List<PeopleModel> peoples = this.starWarsGateway.findAllPeople();
		return ResponseEntity.ok().body(peoples);
	}

}
