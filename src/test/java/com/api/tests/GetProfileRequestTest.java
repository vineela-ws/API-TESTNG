package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagmentService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;


public class GetProfileRequestTest {
	
	@Test
	
	public void getProfileInfoTest() {
		AuthService authservice = new AuthService();
		Response response = authservice.login(new LoginRequest("Vineela98765","Varam@98765"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
        
		UserProfileManagmentService UserProfileManagmentService =new UserProfileManagmentService();
		response =UserProfileManagmentService.getProfile(loginResponse.getToken());	
		UserProfileResponse userProfileResponse =response.as(UserProfileResponse.class);
	}

}
