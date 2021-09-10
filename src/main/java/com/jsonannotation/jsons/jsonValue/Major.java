package com.jsonannotation.jsons.jsonValue;

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
}
