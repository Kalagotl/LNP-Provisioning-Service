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

    // Getters and setters
}
