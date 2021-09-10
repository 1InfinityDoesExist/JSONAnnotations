package com.jsonannotation.jsons.jsonEnumDefautlValue;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Major {

	// Enable key in app.properties.
	PHYSICS("physics"), CHEMISTRY("chemistry"), MATHS("maths"), @JsonEnumDefaultValue
	UNKNOWN("unknown");

	private String value;

	private Major(String value) {
		this.value = value;
	}

	@JsonValue
	private String value() {
		return value;
	}
}
