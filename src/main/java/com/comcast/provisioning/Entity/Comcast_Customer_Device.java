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
