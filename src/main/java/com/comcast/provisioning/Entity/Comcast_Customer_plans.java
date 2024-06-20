package com.comcast.provisioning.Entity;

import jakarta.persistence.*;

@Entity
public class Comcast_Customer_plans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String planName;
    private String description;
    private double price;
    private String validity;
    private boolean isActive;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Comcast_Customer_Details customerDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Comcast_Customer_Details getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(Comcast_Customer_Details customerDetails) {
		this.customerDetails = customerDetails;
	}

    // Getters and setters
}
