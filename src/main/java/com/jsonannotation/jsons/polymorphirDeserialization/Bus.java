package com.jsonannotation.jsons.polymorphirDeserialization;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "bus")
public class Bus implements Vehicle {

	private String busName;
	private String busType;

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

}
