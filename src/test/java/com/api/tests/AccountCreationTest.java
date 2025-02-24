package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class AccountCreationTest {
	@Test(description = "Verify if Account Creation API is working...")
    
	public void createAccountTest() {
		SignupRequest signupRequest= new SignupRequest.builder().username("disha123")
		.email("disha@yahoo.com")
		.firstName("Disha")
		.password("disha123")
		.mobileNumber("777777777")
		.build();		
		AuthService authservice = new AuthService();
		Response response = authservice.signUp(signupRequest);	
		Assert.assertEquals(response.asPrettyString(),"User Registered Successfully");
		Assert.assertEquals(response.statusCode(),200);

	}

}
