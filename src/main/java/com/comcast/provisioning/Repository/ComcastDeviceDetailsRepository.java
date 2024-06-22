package com.comcast.provisioning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comcast.provisioning.Entity.Comcast_Customer_Device;

import java.util.Optional;

public interface ComcastDeviceDetailsRepository extends JpaRepository<Comcast_Customer_Device, Long> {
    Optional<Comcast_Customer_Device> findByIccid(String iccid);
}