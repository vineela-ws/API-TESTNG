package com.api.base;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	//Wrapper the RestAssured
	//Base URI
	//Creating the Request
	//Handling the response
	
	
	
	private static final String BASE_URL="";
	private RequestSpecification requestSpecification;
	
	public BaseService() {
		requestSpecification = given().baseUri(BASE_URL);
	}
	
	{
		RestAssured.filters(new LoggingFilter());
	}
	
	protected RequestSpecification setAuthToken(String token) {
		return requestSpecification.header("Authorization","Bearer " + token);
	}
	
	protected Response getRequest(String endpoint) {
		return requestSpecification.get(endpoint);
	}
	
	protected Response postRequest(Object payload,String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	protected Response putRequest(Object payload,String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
	}

}
