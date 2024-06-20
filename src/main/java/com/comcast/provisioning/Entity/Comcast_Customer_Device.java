package com.comcast.provisioning.Entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Comcast_Customer_Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sku;
    private String upc;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public LocalDate getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(LocalDate activationDate) {
		this.activationDate = activationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Comcast_Customer_Details getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(Comcast_Customer_Details customerDetails) {
		this.customerDetails = customerDetails;
	}

	private String iccid;
    private String deviceName;
    private String deviceType;
    private LocalDate activationDate;
    private String status;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Comcast_Customer_Details customerDetails;

    // Getters and setters
}
