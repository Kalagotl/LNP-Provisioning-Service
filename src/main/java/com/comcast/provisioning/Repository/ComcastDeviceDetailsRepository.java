package com.comcast.provisioning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.comcast.provisioning.Entity.Comcast_Device_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ComcastDeviceDetailsRepository extends JpaRepository<Comcast_Device_Details, Long> {
    Optional<Comcast_Device_Details> findByIccid(String iccid);
}
