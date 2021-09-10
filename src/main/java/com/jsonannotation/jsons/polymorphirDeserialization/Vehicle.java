package com.jsonannotation.jsons.polymorphirDeserialization;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @Type(value = Car.class, name = "car"), @Type(value = Bus.class, name = "bus"),
		@Type(value = Bike.class, name = "bike") })
public interface Vehicle {

}
