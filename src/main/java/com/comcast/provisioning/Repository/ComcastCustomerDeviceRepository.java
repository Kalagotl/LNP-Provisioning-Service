package com.comcast.provisioning.Repository;
import com.comcast.provisioning.Entity.Comcast_Customer_Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComcastCustomerDeviceRepository extends JpaRepository<Comcast_Customer_Device, Long> {
    // You can add custom query methods here if needed
}
