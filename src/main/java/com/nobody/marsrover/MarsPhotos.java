package com.nobody.marsrover;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsPhotos {
	
	//objects
	private long id;
	private long sol;
	private Camera camera;
	@JsonProperty("img_src")
	private String imgSrc;
	@JsonProperty("earth_date")
	private String earthDate;
	private Rover rover;
	
	//setters and getters
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSol() {
		return sol;
	}
	public void setSol(long sol) {
		this.sol = sol;
	}
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	public String getEarthDate() {
		return earthDate;
	}
	public void setEarthDate(String earthDate) {
		this.earthDate = earthDate;
	}
	public Rover getRover() {
		return rover;
	}
	public void setRover(Rover rover) {
		this.rover = rover;
	}
	
	//toString()
	@Override
	public String toString() {
		return "MarsPhotos [id=" + id + ", sol=" + sol + ", camera=" + camera + ", imgSrc=" + imgSrc + ", earthDate="
				+ earthDate + ", rover=" + rover + "]";
	}
}
