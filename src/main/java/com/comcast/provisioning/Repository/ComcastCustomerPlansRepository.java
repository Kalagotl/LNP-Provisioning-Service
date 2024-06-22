package com.comcast.provisioning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comcast.provisioning.Entity.Comcast_Customer_plans;

@Repository
public interface ComcastCustomerPlansRepository extends JpaRepository<Comcast_Customer_plans, Long> {
    // You can add custom query methods here if needed
}
