package com.onlineBookStore.Dto;

public class customerDto {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String city;
	private String phoneNumber;
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public customerDto(Long id, String firstName, String lastName, String city, String phoneNumber, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public customerDto() {
		super();
	}
	@Override
	public String toString() {
		return "customerDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	

}
