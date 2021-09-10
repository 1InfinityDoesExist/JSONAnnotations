package com.jsonannotation.jsons.jsonGetterAndSetter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JsonGetterSetterAnnotationBean implements Serializable {

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
	private boolean isStudent;

	@JsonGetter("isStudent")
	public boolean isStudent() {
		return isStudent;
	}

	@JsonSetter("isStudent")
	public void setStudent(boolean isStudent) {
		this.isStudent = isStudent;
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
