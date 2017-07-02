# spring-boot-geocoding-rest-consumer
spring boot rest consumer - consuming google geocoding apis

This is a simple example of a spring boot rest consumer. The application calls the google geocoding api with address as request parameter.

Running the example with api-key
--------------------------------

To run the example, you need a google api key to be passed as request parameter. The same can be generated via -
https://developers.google.com/maps/documentation/geocoding/start#get-a-key

The generated key needs to be put in a properties file in the path src/main/resources/apikey.properties as below -
apiKey=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
