package com.comcast.provisioning.Repository;

import com.comcast.provisioning.Entity.Comcast_Available_Plans;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ComcastAvailablePlansRepository extends JpaRepository<Comcast_Available_Plans, Long> {
    Optional<Comcast_Available_Plans> findByPlanName(String planName);
}