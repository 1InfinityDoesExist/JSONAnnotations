package com.jsonannotation.jsons.jsonCreator;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonCreatorAnnotationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2334837887963425378L;

	private Major major;
	public String id;
	public String name;

	@JsonCreator
	public JsonCreatorAnnotationBean(@JsonProperty("id") String id, @JsonProperty("theName") String name,
			@JsonProperty("major_subject") Major major) {
		this.id = id;
		this.major = major;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

}
