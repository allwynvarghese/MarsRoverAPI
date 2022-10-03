package com.nobody.marsrover;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nobody.marsrover.MarsRoverAPIResponse;

@Service
public class MarsRoverApiServices {

	public MarsRoverAPIResponse getRoverData() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity <MarsRoverAPIResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2&api_key=I0GLFEPkSmW5vsf9hBBqknOwROkd2qrB8HXTxZpy", MarsRoverAPIResponse.class);

		return response.getBody();
	}
}
