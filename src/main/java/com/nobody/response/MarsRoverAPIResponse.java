package com.nobody.response;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverAPIResponse {
	
	List <MarsPhotos> photos = new ArrayList<>();

	
	
	public List<MarsPhotos> getPhotos() {
		return photos;
	}



	public void setPhotos(List<MarsPhotos> photos) {
		this.photos = photos;
	}



	@Override
	public String toString() {
		return "MarsRoverAPIResponse [photos=" + photos + "]";
	}

}
