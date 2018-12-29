package com.cardecor.model;

import java.util.List;

public class Car {
    private String carName;
    private List<CarAccesory> carAccessory;
     
    public Car(){}

	public Car(String carName, List<CarAccesory> carAccessory) {
		super();
		this.carName = carName;
		this.carAccessory = carAccessory;
	}

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