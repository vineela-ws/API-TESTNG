package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	@Test(description = "Verify if forgot password API is working...")
    
	public void createAccountTest() {
		AuthService authservice = new AuthService();
		Response response = authservice.forgotPassword("");
		System.out.println(response.asPrettyString());
	}
}
