package com.api.models.request;

import com.api.models.request.SignupRequest.builder;

public class ProfileRequest {
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	
	public ProfileRequest(String firstName, String lastName, String email, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		return "ProfileRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	public static class builder{
		private String firstName;
		private String lastName;
		private String email;
		private String mobileNumber;
	

	public builder email(String email) {
		this.email = email;
		return this;
	}

	public builder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public builder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public builder mobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}

	public ProfileRequest build() {
		ProfileRequest profileRequest = new ProfileRequest(email, firstName, lastName,
				mobileNumber);
		return profileRequest;

	}

	}
}
