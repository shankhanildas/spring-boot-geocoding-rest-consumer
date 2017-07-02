package org.nil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeocodingApplication {
	
	/*@Autowired
	private Environment env;*/
	
	public static void main(String[] args) {
		SpringApplication.run(GeocodingApplication.class, args);
	}
	
	/*@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}*/
	
	/*@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			System.out.println("-----> " + env.getProperty("apiKey"));
			GeoCoding geoCoding = restTemplate.getForObject(
					"https://maps.googleapis.com/maps/api/geocode/json?address=SLS+Sapphire&key=AIzaSyCEHvPwo2BLLzjaJ-YPkLm2syxIy_DSqas", GeoCoding.class);
			log.info(geoCoding.toString());
		};
	}*/

}
