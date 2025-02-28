package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagmentService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {

	@Test

	public void updateProfileTest() {
		AuthService authservice = new AuthService();
		Response response = authservice.login(new LoginRequest("Vineela98765", "Varam@98765"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
        
		System.out.println("***********************************************");

		UserProfileManagmentService userProfileManagmentService = new UserProfileManagmentService();
		userProfileManagmentService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "Vineela98765");
		
		ProfileRequest profileRequest = new ProfileRequest.builder()
				.firstName("")
				.lastName("")
				.email("")
				.mobileNumber(null)
				.build();
		        
		  
		System.out.println("***********************************************");
		response = userProfileManagmentService.updateProfile(loginResponse.getToken(), profileRequest);
		System.out.println(response.asPrettyString());
                
	}
}
