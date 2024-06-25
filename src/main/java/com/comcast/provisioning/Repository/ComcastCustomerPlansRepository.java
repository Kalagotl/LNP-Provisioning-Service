package com.comcast.provisioning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.comcast.provisioning.Entity.Comcast_Customer_Plans;

@Repository
public interface ComcastCustomerPlansRepository extends CrudRepository<Comcast_Customer_Plans, Long> {
    // You can add custom query methods here if needed
}
