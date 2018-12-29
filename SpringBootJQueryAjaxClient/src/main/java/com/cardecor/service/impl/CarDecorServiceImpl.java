package com.cardecor.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cardecor.model.Car;
import com.cardecor.model.CarAccesory;
import com.cardecor.service.CarDecorService;

@Service
public class CarDecorServiceImpl implements CarDecorService {

	@Override
	public Car getCarInfo(String carName) {
		
		List<CarAccesory> carAccessoryList = new ArrayList<CarAccesory>();
		CarAccesory carAccesory = new CarAccesory();
		carAccesory.setCarAccessoryId(123L);
		carAccesory.setAccessoryName("Door beeding");
		carAccesory.setPrice(1000.0);
		carAccesory.setQuantityAvailable(10L);
		
		Car car = new Car(carName, carAccessoryList );
		
		return car;
	}

}
