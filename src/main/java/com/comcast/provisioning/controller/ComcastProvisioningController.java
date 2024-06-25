package com.comcast.provisioning.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comcast.provisioning.Entity.Comcast_Customer_Details;
import com.comcast.provisioning.Entity.Comcast_Customer_Device;
import com.comcast.provisioning.Entity.Comcast_Customer_Plans;
import com.comcast.provisioning.Service.ComcastProvisioningServiceImpl;
import com.comcast.provisioning.dto.ComcastCustomerDetailsRequest;
import com.comcast.provisioning.dto.ComcastCustomerDetailsResponse;
import com.comcast.provisioning.mapper.ComcastCustomerDetailsMapper;
import com.comcast.provisioning.mapper.ComcastDeviceMapper;
import com.comcast.provisioning.mapper.ComcastPlanMapper;

@RestController
@RequestMapping("/comcast")
public class ComcastProvisioningController {
	@Autowired
	private ComcastProvisioningServiceImpl  comcastProvisioningServiceImpl;
	@Autowired
	private ComcastCustomerDetailsMapper comcastCustomerDetailsMapper;
	@Autowired
	private ComcastPlanMapper comcastPlanMapper;
	@Autowired
	private ComcastDeviceMapper comcastDeviceMapper;
	@PostMapping("/provisioning")
	public  ComcastCustomerDetailsResponse Provisioning(@RequestBody ComcastCustomerDetailsRequest comcastCustomerDetailsRequest) {
		ComcastCustomerDetailsResponse comcastCustomerDetailsResponse = new ComcastCustomerDetailsResponse();
		List<String> Messages = new ArrayList();
		try
		{
			if(comcastCustomerDetailsRequest.getSpid()==null) 
			{
				Messages.add("Spid Must not be null ");
			}
			if(comcastCustomerDetailsRequest.getTransactionId()==null) 
			{
				Messages.add("Transaction Id must  not be null");
			}
			if (Messages.isEmpty())
			{


				Comcast_Customer_Details comcast_Customer_Details =comcastCustomerDetailsMapper.mapCustomerDetails(comcastCustomerDetailsRequest);//Map the request to entity
				Comcast_Customer_Plans customerPlans =comcastPlanMapper.map(comcastCustomerDetailsRequest);
				customerPlans.setCustomerDetails(comcast_Customer_Details);
				List<Comcast_Customer_Plans> comcast_Customer_Plans = new ArrayList();
				comcast_Customer_Details.setCustomerPlans(comcast_Customer_Plans);
				Comcast_Customer_Device customerDevice =comcastDeviceMapper.map(comcastCustomerDetailsRequest);
				customerDevice.setCustomerDetails(comcast_Customer_Details);
				List<Comcast_Customer_Device> comcast_Customer_Device = new ArrayList();
			   comcast_Customer_Details.setCustomerDevices(comcast_Customer_Device);
				// Save the customer details using the service
				comcastProvisioningServiceImpl.saveCustomerDetails(comcast_Customer_Details);
			
				//comcastProvisioningServiceImpl.saveCustomerPlansAndDevice(customerPlans, customerDevice);
			}

		}
		catch(Exception e) 
		{
			Messages.add("An error occurred: " + e.getMessage());		} 
		finally 
		{
			comcastCustomerDetailsResponse.setMessages(Messages);// Set the messages in the response object
		}

		return comcastCustomerDetailsResponse;// Return the response object

	}
}
