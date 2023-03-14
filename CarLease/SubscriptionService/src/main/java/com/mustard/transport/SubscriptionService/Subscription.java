package com.mustard.transport.SubscriptionService;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Subscription {

	@Column(name = "ID")
	private Integer Id;

	@Column(name = "Description")
	private String description;

	@Column(name = "Cost")
	private String cost;

	
	public Subscription() {

	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}
}
