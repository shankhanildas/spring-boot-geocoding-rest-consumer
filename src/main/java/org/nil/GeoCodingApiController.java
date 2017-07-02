package org.nil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class GeoCodingApiController {

	private static final Logger log = LoggerFactory.getLogger(GeoCodingApiController.class);
	private static final String GEOCODING_URI = "https://maps.googleapis.com/maps/api/geocode/json";
	
	@Autowired
	private Environment env;

	@RequestMapping("/getGeoCoding")
	public GeoCoding getGeoCodingForLoc(@RequestParam(value = "address", defaultValue="silicon+valley") String address) {
		RestTemplate restTemplate = new RestTemplate();
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(GEOCODING_URI).queryParam("address", address)
				.queryParam("key", env.getProperty("apiKey"));
			
		log.info("Calling geocoding api with: " + builder.toUriString());
		
		GeoCoding geoCoding = restTemplate.getForObject(builder.toUriString(), GeoCoding.class);
		log.info(geoCoding.toString());

		return geoCoding;
	}
}
