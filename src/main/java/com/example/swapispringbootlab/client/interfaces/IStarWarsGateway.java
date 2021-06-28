package com.example.swapispringbootlab.client.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.swapispringbootlab.config.FeignConfig;
import com.example.swapispringbootlab.model.PeopleModel;

@FeignClient(url = "${app.feign.config.url}", name="starwars", configuration = {FeignConfig.class})
public interface IStarWarsGateway {

	@GetMapping("/people")
	List<PeopleModel> findAllPeople();

}
