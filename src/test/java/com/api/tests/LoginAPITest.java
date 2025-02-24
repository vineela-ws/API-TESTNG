package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {

	@Test(description = "Verify if login API is working...")
	public void loginTest() {
	    LoginRequest loginRequest = new LoginRequest("Vineela98765","Varam@98765");
		AuthService authservice = new AuthService();
		Response response = authservice.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
	}

}
