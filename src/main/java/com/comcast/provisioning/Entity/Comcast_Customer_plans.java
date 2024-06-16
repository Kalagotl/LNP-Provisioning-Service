package com.comcast.provisioning.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Comcast_Customer_plans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String offerName;
    private String description;
    private double discount;
    private boolean isActive;
    private String termsAndConditions;
    private String eligibilityCriteria;
    private String applicablePlans;

    // Constructors, getters, and setters
    @OneToOne
    @JoinColumn(name = "customer_details_id") // Assuming this is the foreign key column name in the database
    private Comcast_Customer_Details customerDetails;
    

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    public void setEligibilityCriteria(String eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public String getApplicablePlans() {
        return applicablePlans;
    }

    public void setApplicablePlans(String applicablePlans) {
        this.applicablePlans = applicablePlans;
    }
    
}