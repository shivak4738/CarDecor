package com.javasampleapproach.jqueryajax.model;

import java.util.List;

public class Car {
    private String carName;
    private List<CarAccesory> carAccessory;
     
    public Car(){}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public List<CarAccesory> getCarAccessory() {
		return carAccessory;
	}

	public void setCarAccessory(List<CarAccesory> carAccessory) {
		this.carAccessory = carAccessory;
	}
    
    
     
    
}