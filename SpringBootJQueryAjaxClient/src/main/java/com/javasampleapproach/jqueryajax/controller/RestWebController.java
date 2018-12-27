package com.javasampleapproach.jqueryajax.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.jqueryajax.message.Response;
import com.javasampleapproach.jqueryajax.model.Car;

@RestController
@RequestMapping("/api/car")
public class RestWebController {

	List<Car> carList = new ArrayList<Car>();

	@RequestMapping(value = "/all", method=RequestMethod.GET)
	public Response getResource() {
		Response response = new Response("Done", carList);
		return response;
	}

	@RequestMapping(value = "/save", method=RequestMethod.POST, consumes="application/json", produces="application/json")
	@ResponseBody
	public Response saveCarAccessory(@RequestBody Car car) {
		carList.add(car);
		
		// Create Response Object
		Response response = new Response("Done", car);
		return response;
	}
}