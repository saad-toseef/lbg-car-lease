package com.mustard.transport.customers.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Customer {

	@Column(name = "ID")
	private Integer Id;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "Address1")
	private Integer address1;

	@Column(name = "Address2")
	private Integer address2;

	
	@Column(name = "Postcode")
	private String postcode;

	@Column(name = "DrivingLicenceNumber")
	private String drivingLicenceNumber;
	
	public Customer() {

	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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

	public Integer getAddress1() {
		return address1;
	}

	public void setAddress1(Integer address1) {
		this.address1 = address1;
	}

	public Integer getAddress2() {
		return address2;
	}

	public void setAddress2(Integer address2) {
		this.address2 = address2;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getDrivingLicenceNumber() {
		return drivingLicenceNumber;
	}

	public void setDrivingLicenceNumber(String drivingLicenceNumber) {
		this.drivingLicenceNumber = drivingLicenceNumber;
	}


}
