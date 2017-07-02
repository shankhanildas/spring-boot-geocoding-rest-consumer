package org.nil;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GeoCoding {
	String status;
	
	@JsonProperty(value="results")
	GeoCodingResult[] geoCodingResults;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GeoCodingResult[] getGeoCodingResults() {
		return geoCodingResults;
	}

	public void setGeoCodingResults(GeoCodingResult[] geoCodingResults) {
		this.geoCodingResults = geoCodingResults;
	}

	@Override
	public String toString() {
		return "GeoCoding [status=" + status + ", geoCodingResults=" + Arrays.toString(geoCodingResults) + "]";
	}
}
