package com.cardecor.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CarAccesory {

	private Long carAccessoryId;
	private String accessoryName;
	private Boolean isAccessoryAvailable;
	private Long quantityAvailable;
	private Double price;
	public Long getCarAccessoryId() {
		return carAccessoryId;
	}
	public void setCarAccessoryId(Long carAccessoryId) {
		this.carAccessoryId = carAccessoryId;
	}
	public String getAccessoryName() {
		return accessoryName;
	}
	public void setAccessoryName(String accessoryName) {
		this.accessoryName = accessoryName;
	}
	public Boolean getIsAccessoryAvailable() {
		return isAccessoryAvailable;
	}
	public void setIsAccessoryAvailable(Boolean isAccessoryAvailable) {
		this.isAccessoryAvailable = isAccessoryAvailable;
	}
	public Long getQuantityAvailable() {
		return quantityAvailable;
	}
	public void setQuantityAvailable(Long quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
