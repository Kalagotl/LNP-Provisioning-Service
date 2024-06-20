package com.comcast.provisioning.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comcast.provisioning.Entity.Comcast_Customer_Details;

@Repository
public interface ComcastCustomerDetailsRepository extends JpaRepository<Comcast_Customer_Details, Long> {
    // You can add custom query methods if needed
}
