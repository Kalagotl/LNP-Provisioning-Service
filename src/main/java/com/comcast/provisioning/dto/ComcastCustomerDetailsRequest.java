package com.comcast.provisioning.dto;
import java.util.Date;
import java.util.List;

public class ComcastCustomerDetailsRequest {

	private String customerName; // Customer details
	private String email;
	private String phoneNumber;
	private Date dateOfBirth;
	private String gender;
	private String passport;
	private String customerId;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	private Date customerActiveDate;
	private Date customerDeactiveDate;
	private Long Spid;
	private String TransactionId;
	private String Plan;
	public void setPlan(String plan) {
		Plan = plan;
	}
	private List<ComcastCustomerAddressRequest> comcastCustomerAddressRequest;

	public List<ComcastCustomerAddressRequest> getComcastCustomerAddressRequest() {
		return comcastCustomerAddressRequest;
	}
	public void setComcastCustomerAddressRequest(List<ComcastCustomerAddressRequest> comcastCustomerAddressRequest) {
		this.comcastCustomerAddressRequest = comcastCustomerAddressRequest;
	}
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
	public Date getCustomerDeactiveDate() {
		return customerDeactiveDate;
	}
	public void setCustomerDeactiveDate(Date customerDeactiveDate) {
		this.customerDeactiveDate = customerDeactiveDate;
	}
	public Long getSpid() {
		return Spid;
	}
	public void setSpid(Long spid) {
		Spid = spid;
	}
	public String getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}
	public String getPlan() {
		// TODO Auto-generated method stub
		return null;
	}

}
