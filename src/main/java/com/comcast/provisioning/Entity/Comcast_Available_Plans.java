package com.comcast.provisioning.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comcast_Available_Plans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String planName;
    private String description;
    private double price;
    private String validity;
    private boolean isActive;
    private int dataLimitGB;
    private int smsLimit;
    private int internationalMinutes;
    private boolean unlimitedNightData;
    private boolean dataRollover;

    // One month plan fields
    private double oneMonthPrice;
    private String oneMonthValidity;
    private boolean oneMonthIsActive;

    // Two months plan fields
    private double twoMonthsPrice;
    private String twoMonthsValidity;
    private boolean twoMonthsIsActive;

    // Three months plan fields
    private double threeMonthsPrice;
    private String threeMonthsValidity;
    private boolean threeMonthsIsActive;

    // Six months plan fields
    private double sixMonthsPrice;
    private String sixMonthsValidity;
    private boolean sixMonthsIsActive;

    // Yearly plan fields
    private double yearlyPrice;
    private String yearlyValidity;
    private boolean yearlyIsActive;
    @ManyToOne
    @JoinColumn(name = "customer_id") // Assuming this is the foreign key column name in the database
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
	public int getDataLimitGB() {
		return dataLimitGB;
	}
	public void setDataLimitGB(int dataLimitGB) {
		this.dataLimitGB = dataLimitGB;
	}
	public int getSmsLimit() {
		return smsLimit;
	}
	public void setSmsLimit(int smsLimit) {
		this.smsLimit = smsLimit;
	}
	public int getInternationalMinutes() {
		return internationalMinutes;
	}
	public void setInternationalMinutes(int internationalMinutes) {
		this.internationalMinutes = internationalMinutes;
	}
	public boolean isUnlimitedNightData() {
		return unlimitedNightData;
	}
	public void setUnlimitedNightData(boolean unlimitedNightData) {
		this.unlimitedNightData = unlimitedNightData;
	}
	public boolean isDataRollover() {
		return dataRollover;
	}
	public void setDataRollover(boolean dataRollover) {
		this.dataRollover = dataRollover;
	}
	public double getOneMonthPrice() {
		return oneMonthPrice;
	}
	public void setOneMonthPrice(double oneMonthPrice) {
		this.oneMonthPrice = oneMonthPrice;
	}
	public String getOneMonthValidity() {
		return oneMonthValidity;
	}
	public void setOneMonthValidity(String oneMonthValidity) {
		this.oneMonthValidity = oneMonthValidity;
	}
	public boolean isOneMonthIsActive() {
		return oneMonthIsActive;
	}
	public void setOneMonthIsActive(boolean oneMonthIsActive) {
		this.oneMonthIsActive = oneMonthIsActive;
	}
	public double getTwoMonthsPrice() {
		return twoMonthsPrice;
	}
	public void setTwoMonthsPrice(double twoMonthsPrice) {
		this.twoMonthsPrice = twoMonthsPrice;
	}
	public String getTwoMonthsValidity() {
		return twoMonthsValidity;
	}
	public void setTwoMonthsValidity(String twoMonthsValidity) {
		this.twoMonthsValidity = twoMonthsValidity;
	}
	public boolean isTwoMonthsIsActive() {
		return twoMonthsIsActive;
	}
	public void setTwoMonthsIsActive(boolean twoMonthsIsActive) {
		this.twoMonthsIsActive = twoMonthsIsActive;
	}
	public double getThreeMonthsPrice() {
		return threeMonthsPrice;
	}
	public void setThreeMonthsPrice(double threeMonthsPrice) {
		this.threeMonthsPrice = threeMonthsPrice;
	}
	public String getThreeMonthsValidity() {
		return threeMonthsValidity;
	}
	public void setThreeMonthsValidity(String threeMonthsValidity) {
		this.threeMonthsValidity = threeMonthsValidity;
	}
	public boolean isThreeMonthsIsActive() {
		return threeMonthsIsActive;
	}
	public void setThreeMonthsIsActive(boolean threeMonthsIsActive) {
		this.threeMonthsIsActive = threeMonthsIsActive;
	}
	public double getSixMonthsPrice() {
		return sixMonthsPrice;
	}
	public void setSixMonthsPrice(double sixMonthsPrice) {
		this.sixMonthsPrice = sixMonthsPrice;
	}
	public String getSixMonthsValidity() {
		return sixMonthsValidity;
	}
	public void setSixMonthsValidity(String sixMonthsValidity) {
		this.sixMonthsValidity = sixMonthsValidity;
	}
	public boolean isSixMonthsIsActive() {
		return sixMonthsIsActive;
	}
	public void setSixMonthsIsActive(boolean sixMonthsIsActive) {
		this.sixMonthsIsActive = sixMonthsIsActive;
	}
	public double getYearlyPrice() {
		return yearlyPrice;
	}
	public void setYearlyPrice(double yearlyPrice) {
		this.yearlyPrice = yearlyPrice;
	}
	public String getYearlyValidity() {
		return yearlyValidity;
	}
	public void setYearlyValidity(String yearlyValidity) {
		this.yearlyValidity = yearlyValidity;
	}
	public boolean isYearlyIsActive() {
		return yearlyIsActive;
	}
	public void setYearlyIsActive(boolean yearlyIsActive) {
		this.yearlyIsActive = yearlyIsActive;
	}
    
    // Getters and setters for all fields
    
}
