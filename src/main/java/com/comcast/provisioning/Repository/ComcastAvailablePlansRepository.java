package com.comcast.provisioning.Repository;

import com.comcast.provisioning.Entity.Comcast_Available_Plans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ComcastAvailablePlansRepository extends CrudRepository<Comcast_Available_Plans, Long> {
	Optional<Comcast_Available_Plans> findByPlanName(String planName);

}