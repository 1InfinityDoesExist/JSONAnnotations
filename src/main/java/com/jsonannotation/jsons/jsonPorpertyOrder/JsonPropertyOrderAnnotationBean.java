package com.jsonannotation.jsons.jsonPorpertyOrder;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//The one that is not mention will be at last...!!!

@JsonPropertyOrder({ "id", "name", "school", "responseText", "responseCode", "section" })
public class JsonPropertyOrderAnnotationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2334837887963425378L;

	private String id;
	private String name;
	private String school;
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
