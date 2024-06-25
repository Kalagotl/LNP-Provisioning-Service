package com.comcast.provisioning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.comcast.provisioning.Entity.Comcast_Customer_Device;

import java.util.Optional;
@Repository
public interface ComcastDeviceDetailsRepository extends CrudRepository<Comcast_Customer_Device, Long> {
    Optional<Comcast_Customer_Device> findByIccid(String iccid);
}