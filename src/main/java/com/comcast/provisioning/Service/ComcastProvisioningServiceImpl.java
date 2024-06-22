package com.comcast.provisioning.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comcast.provisioning.Entity.Comcast_Customer_Details;
import com.comcast.provisioning.Entity.Comcast_Customer_Device;
import com.comcast.provisioning.Entity.Comcast_Customer_plans;
import com.comcast.provisioning.Repository.ComcastCustomerDetailsRepository;
import com.comcast.provisioning.Repository.ComcastCustomerDeviceRepository;
import com.comcast.provisioning.Repository.ComcastCustomerPlansRepository;
import com.comcast.provisioning.Repository.ComcastDeviceDetailsRepository;
import com.comcast.provisioning.dto.ComcastCustomerDetailsRequest;
import com.comcast.provisioning.mapper.ComcastDeviceMapper;
import com.comcast.provisioning.mapper.ComcastPlanMapper;

import jakarta.transaction.Transactional;

@Service 
public class ComcastProvisioningServiceImpl implements ComcastProvisioningService {

	@Autowired
	private ComcastCustomerDetailsRepository comcastCustomerDetailsRepository;

	@Autowired
	private ComcastDeviceDetailsRepository comcastDeviceDetailsRepository;
	@Autowired
    private ComcastPlanMapper planMapper;
	@Autowired
	private ComcastDeviceMapper comcastDeviceMapper;
	@Override
	public void saveCustomerDetails(Comcast_Customer_Details customerDetails) {
		comcastCustomerDetailsRepository.save(customerDetails);

	}
	@Autowired
    private ComcastCustomerPlansRepository customerPlansRepository;

    @Autowired
    private ComcastCustomerDeviceRepository customerDeviceRepository;

    public void saveCustomerPlansAndDevice(Comcast_Customer_plans customerPlans, Comcast_Customer_Device customerDevice) {
        customerPlansRepository.save(customerPlans);
        customerDeviceRepository.save(customerDevice);
    }

}
