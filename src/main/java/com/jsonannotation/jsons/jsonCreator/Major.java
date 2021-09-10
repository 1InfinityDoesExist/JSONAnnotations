package com.jsonannotation.jsons.jsonCreator;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Major {

	PHYSICS("physics"), CHEMISTRY("chemistry"), MATHS("maths");

	private String value;

	private Major(String value) {
		this.value = value;
	}

	@JsonValue
	private String value() {
		return value;
	}

	@JsonCreator
	public static Major fromValue(String value) {
		for (Major type : Major.values()) {
			if (type.value.equals(value)) {
				return type;
			}
		}
		return null;
	}
}
