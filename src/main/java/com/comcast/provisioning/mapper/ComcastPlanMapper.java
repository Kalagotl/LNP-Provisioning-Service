package com.comcast.provisioning.mapper;

import com.comcast.provisioning.Entity.Comcast_Available_Plans;
import com.comcast.provisioning.Entity.Comcast_Customer_Plans;
import com.comcast.provisioning.Repository.ComcastAvailablePlansRepository;
import com.comcast.provisioning.dto.ComcastCustomerDetailsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ComcastPlanMapper {

    @Autowired
    private ComcastAvailablePlansRepository availablePlansRepository;

    public Comcast_Customer_Plans map(ComcastCustomerDetailsRequest request) {
        Comcast_Customer_Plans customerPlan = new Comcast_Customer_Plans();
        try {
            // Find the plan details by plan name
            Optional<Comcast_Available_Plans> planDetailsOpt = availablePlansRepository.findByPlanName(request.getPlanName());

            // If the plan details are present, map them to the customer plan
            if (planDetailsOpt.isPresent()) {
                Comcast_Available_Plans planDetails = planDetailsOpt.get();
                customerPlan.setPlanName(planDetails.getPlanName());
                customerPlan.setDescription(planDetails.getDescription());
                customerPlan.setPrice(planDetails.getPrice());
                customerPlan.setValidity(planDetails.getValidity());
                customerPlan.setIsActive(planDetails.getIsActive());
            } else {
                throw new RuntimeException("Plan details not found for Plan Name: " + request.getPlanName());
            }
        } catch (Exception e) {
            // Handle the exception, log, or re-throw as needed
            throw new RuntimeException("Error occurred while mapping plan details: " + e.getMessage(), e);
        }
        return customerPlan;
    }
}
