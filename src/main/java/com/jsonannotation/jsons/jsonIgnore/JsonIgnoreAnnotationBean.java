package com.jsonannotation.jsons.jsonIgnore;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

@JsonIgnoreProperties({ "major", "school" })
public class JsonIgnoreAnnotationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2334837887963425378L;

	private String id;
	private String name;
	private String school;
	@JsonIgnore
	private String section;
	private String major;
	private String responseCode;
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
