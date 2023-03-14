package com.mustard.transport.CarService;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Car {

	@Column(name = "ID")
	private Integer Id;

	@Column(name = "Manufacturer")
	private String manufacturer;

	@Column(name = "Model")
	private String model;

	@Column(name = "Year")
	private Integer year;

	@Column(name = "Description")
	private String description;

	@Column(name = "Registration")
	private String registration;

	@Column(name = "Colour")
	private String colour;

	@Column(name = "ContractEnd")
	private String contractEnd;

	@Column(name = "Term")
	private Integer term;

	@Column(name = "HighestRecordedMileage")
	private Integer highestRecordedMileage;

	@Column(name = "HRMDate")
	private String hRMDate;

	@Column(name = "FuelType")
	private String fuelType;

	@Column(name = "EngineSize")
	private String engineSize;

	@Column(name = "DayRate")
	private BigDecimal dayRate;

	public Car() {

	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getContractEnd() {
		return contractEnd;
	}

	public void setContractEnd(String contractEnd) {
		this.contractEnd = contractEnd;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public Integer getHighestRecordedMileage() {
		return highestRecordedMileage;
	}

	public void setHighestRecordedMileage(Integer highestRecordedMileage) {
		this.highestRecordedMileage = highestRecordedMileage;
	}

	public String gethRMDate() {
		return hRMDate;
	}

	public void sethRMDate(String hRMDate) {
		this.hRMDate = hRMDate;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	public BigDecimal getDayRate() {
		return dayRate;
	}

	public void setDayRate(BigDecimal dayRate) {
		this.dayRate = dayRate;
	}

}
