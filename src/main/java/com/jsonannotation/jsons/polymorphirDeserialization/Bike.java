package com.jsonannotation.jsons.polymorphirDeserialization;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "bike")
public class Bike implements Vehicle {

	private String bikeName;
	private String bikeType;

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

}
