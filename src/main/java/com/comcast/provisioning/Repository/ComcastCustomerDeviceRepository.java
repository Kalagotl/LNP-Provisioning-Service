package com.comcast.provisioning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comcast.provisioning.Entity.Comcast_Customer_Device;

public interface ComcastCustomerDeviceRepository extends JpaRepository<Comcast_Customer_Device, Long>{
}
