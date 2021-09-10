package com.jsonannotation.jsons.jsonProperty;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * Variable field in the model object should have name (id) and your json
 * request and response object will have a different name for example
 * (student_id)
 * 
 * 
 * 
 * Some fields can be only be used int the request
 * 
 * Some fields are only ment to be sent in the responsel.
 * 
 * @author mossad
 *
 */
public class JsonPropertyAnnotationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2334837887963425378L;

	@JsonProperty(value = "student_id")
	private String id;
	private String name;
	private String school;
	private String section;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String major;
	@JsonProperty(access = Access.READ_ONLY)
	private String responseCode;
	@JsonProperty(access = Access.READ_ONLY)
	private String responseText;

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

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

}
