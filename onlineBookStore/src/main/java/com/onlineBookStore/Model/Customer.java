package com.onlineBookStore.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name", nullable = false)
	@NotBlank(message = "{billing.name.notBlank}")
	private String firstName;

	@Column(name = "last_name", nullable = false)
	@NotBlank(message = "{billing.surname.notBlank}")
	private String lastName;


	@Column(name = "city", nullable = false)
	@NotBlank(message = "{billing.city.notBlank}")
	private String city;

	@Column(name = "phone_number", nullable = false)
	@NotBlank(message = "{billing.phoneNumber.notBlank}")
	private String phoneNumber;

	@Column(name = "email", nullable = false)
	@NotBlank(message = "{billing.email.notBlank}")
	@Email
	private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public Customer(long id, @NotBlank(message = "{billing.name.notBlank}") String firstName,
			@NotBlank(message = "{billing.surname.notBlank}") String lastName,
			@NotBlank(message = "{billing.city.notBlank}") String city,
			@NotBlank(message = "{billing.phoneNumber.notBlank}") String phoneNumber,
			@NotBlank(message = "{billing.email.notBlank}") @Email String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	

}
