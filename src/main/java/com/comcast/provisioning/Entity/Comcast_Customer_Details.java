package com.comcast.provisioning.Entity;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Comcast_Customer_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    @OneToMany(mappedBy = "customerDetails", cascade = CascadeType.ALL)
    private List<Comcast_Customer_Device> customerDevices;

    @OneToMany(mappedBy = "customerDetails", cascade = CascadeType.ALL)
    private List<Comcast_Customer_Plans> customerPlans;

    @OneToMany(mappedBy = "customerDetails", cascade = CascadeType.ALL)
    private List<Comcast_Customer_Address> customerAddresses;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Comcast_Customer_Device> getCustomerDevices() {
        return customerDevices;
    }

    public void setCustomerDevices(List<Comcast_Customer_Device> customerDevices) {
        this.customerDevices = customerDevices;
    }

    public List<Comcast_Customer_Plans> getCustomerPlans() {
        return customerPlans;
    }

    public void setCustomerPlans(List<Comcast_Customer_Plans> customerPlans) {
        this.customerPlans = customerPlans;
    }

    public List<Comcast_Customer_Address> getCustomerAddresses() {
        return customerAddresses;
    }

    public void setCustomerAddresses(List<Comcast_Customer_Address> customerAddresses) {
        this.customerAddresses = customerAddresses;
    }
}
