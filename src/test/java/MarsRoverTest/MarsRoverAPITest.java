package MarsRoverTest;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MarsRoverAPITest {

	@Test
	public void getTest() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity <String> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=I0GLFEPkSmW5vsf9hBBqknOwROkd2qrB8HXTxZpy", String.class);
		System.out.println("Response code: "+response.getStatusCodeValue());
	}
}
