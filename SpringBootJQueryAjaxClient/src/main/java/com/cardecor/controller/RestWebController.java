package com.cardecor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cardecor.message.Response;
import com.cardecor.model.Car;
import com.cardecor.service.CarDecorService;

@RestController
@RequestMapping("/api/car")
public class RestWebController {
	
	@Autowired
	private CarDecorService carDecorService;

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
	
	@RequestMapping(value = "/retrieveData/{carName}", method=RequestMethod.POST, consumes="application/json", produces="application/json")
	@ResponseBody
	public Car getCarInfo(@RequestParam String carName) {
	
		return carDecorService.getCarInfo(carName);
	}
}