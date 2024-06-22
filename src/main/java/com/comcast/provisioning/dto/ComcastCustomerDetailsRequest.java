package com.comcast.provisioning.dto;

import java.util.Date;
import java.util.List;

public class ComcastCustomerDetailsRequest {
    private String customerName;
    private String email;
    private String phoneNumber;
    private Long transactionId;
    private Date dateOfBirth;
    private String gender;
    private String passport;
    private Date customerActiveDate;
    private String status;
    private String planName;
    private String iccid;
    private List<ComcastCustomerAddressRequest> customerAddresses;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public Date getCustomerActiveDate() {
		return customerActiveDate;
	}
	public void setCustomerActiveDate(Date customerActiveDate) {
		this.customerActiveDate = customerActiveDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getIccid() {
		return iccid;
	}
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}
	public List<ComcastCustomerAddressRequest> getCustomerAddresses() {
		return customerAddresses;
	}
	public void setCustomerAddresses(List<ComcastCustomerAddressRequest> customerAddresses) {
		this.customerAddresses = customerAddresses;
	}

    // Getters and Setters
    // ...
    
}
