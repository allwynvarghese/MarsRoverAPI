package com.nobody.marsrover;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Camera {
	
	private long id;
	private String name;
	@JsonProperty("rover_id")
	private Integer roverId;
	@JsonProperty("full_name")
	private String fullName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoverId() {
		return roverId;
	}
	public void setRoverId(Integer roverId) {
		this.roverId = roverId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	@Override
	public String toString() {
		return "Camera [id=" + id + ", name=" + name + ", roverId=" + roverId + ", fullName=" + fullName + "]";
	}

	
}
