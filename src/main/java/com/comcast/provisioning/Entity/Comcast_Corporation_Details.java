package com.comcast.provisioning.Entity;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Comcast_Corporation_Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private String address;
    private String contactNumber;
    private String email;
    private String website;
    private String industry;
    private int foundedYear;
    private int employeeCount;
    private int comcastSpid;
 // Getters and Setters 

    @OneToMany(mappedBy = "comcastCorporationDetails")
    private List<Comcast_Customer_Details> customers;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public int getFoundedYear() {
		return foundedYear;
	}
	public void setFoundedYear(int foundedYear) {
		this.foundedYear = foundedYear;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public int getComcastSpid() {
		return comcastSpid;
	}
	public void setComcastSpid(int comcastSpid) {
		this.comcastSpid = comcastSpid;
	}

    
}