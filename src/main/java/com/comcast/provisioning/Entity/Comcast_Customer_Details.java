package com.comcast.provisioning.Entity;
import java.util.Date;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Comcast_Customer_Details {
	@Id // Indicates the primary key of the entity
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies the generation strategy for the primary key
	private Long Id; // Primary key
	private Long customerId; 
	private String customerName; // Customer details
	private String email;
	private String phoneNumber;
	private Long transactionId;
	private Date dateOfBirth;
	private String gender;
	private String passport;
	private Date customerActiveDate;
	private Date customerDeactiveDate;
	private String plan;
    public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	@ManyToOne
    @JoinColumn(name = "corporation_id") // Assuming this is the foreign key column name in the database
    private Comcast_Corporation_Details comcastCorporationDetails;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comcast_Customer_Address> addresses;
    @OneToOne(mappedBy = "customerDetails")
    private Comcast_Customer_Device customerDevice;
    @OneToOne(mappedBy = "customerDevice")
    private Comcast_Customer_plans customerPlans;
 // One-to-many relationship with Comcast_Available_Plans
    @OneToMany(mappedBy = "customerDetails", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comcast_Available_Plans> availablePlans;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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
	public Date getCustomerDeactiveDate() {
		return customerDeactiveDate;
	}
	public void setCustomerDeactiveDate(Date customerDeactiveDate) {
		this.customerDeactiveDate = customerDeactiveDate;
	}
	public Comcast_Corporation_Details getComcastCorporationDetails() {
		return comcastCorporationDetails;
	}
	public void setComcastCorporationDetails(Comcast_Corporation_Details comcastCorporationDetails) {
		this.comcastCorporationDetails = comcastCorporationDetails;
	}
	public List<Comcast_Customer_Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Comcast_Customer_Address> addresses) {
		this.addresses = addresses;
	}
	public Comcast_Customer_Device getCustomerDevice() {
		return customerDevice;
	}
	public void setCustomerDevice(Comcast_Customer_Device customerDevice) {
		this.customerDevice = customerDevice;
	}
	public Comcast_Customer_plans getCustomerPlans() {
		return customerPlans;
	}
	public void setCustomerPlans(Comcast_Customer_plans customerPlans) {
		this.customerPlans = customerPlans;
	}
	public List<Comcast_Available_Plans> getAvailablePlans() {
		return availablePlans;
	}
	public void setAvailablePlans(List<Comcast_Available_Plans> availablePlans) {
		this.availablePlans = availablePlans;
	}
	public void setSpid(Long spid) {
		// TODO Auto-generated method stub
		
	}
    

}
