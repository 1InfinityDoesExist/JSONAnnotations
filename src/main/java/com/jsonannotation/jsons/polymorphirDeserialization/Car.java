package com.jsonannotation.jsons.polymorphirDeserialization;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "car")
public class Car implements Vehicle {

	private String carName;
	private String carType;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

}