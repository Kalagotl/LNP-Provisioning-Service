package com.comcast.provisioning.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comcast.provisioning.Entity.Comcast_Customer_Details;
import com.comcast.provisioning.Entity.Comcast_Customer_Device;
import com.comcast.provisioning.Repository.ComcastCustomerDetailsRepository;
import com.comcast.provisioning.Repository.ComcastCustomerDeviceRepository;

import jakarta.transaction.Transactional;

@Service 
public class ComcastProvisioningServiceImpl implements ComcastProvisioningService {

	@Autowired
	private ComcastCustomerDetailsRepository comcastCustomerDetailsRepository;

	@Autowired
	private ComcastCustomerDeviceRepository comcastCustomerDeviceRepository;

	@Override
	public void saveCustomerDetails(Comcast_Customer_Details customerDetails) {
		comcastCustomerDetailsRepository.save(customerDetails);

	}




}
