package com.example.swapispringbootlab.client.interfaces;

import com.example.swapispringbootlab.model.BaseModel;
import com.example.swapispringbootlab.model.PeopleModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "${app.feign.config.url}", name="starwars")
public interface IStarWarsGateway {

	@GetMapping(value = "/people")
	BaseModel<PeopleModel> findAllPeople();

}
