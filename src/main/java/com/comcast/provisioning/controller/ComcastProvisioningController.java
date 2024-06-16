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
import com.comcast.provisioning.dto.ComcastCustomerDetailsRequest;
import com.comcast.provisioning.dto.ComcastCustomerDetailsResponse;
import com.comcast.provisioning.mapper.ComcastCustomerDetailsMapper;
import com.verizon.entity.CustomerDetails;


@RestController
@RequestMapping("/comcast")
public class ComcastProvisioningController {
	
  @Autowired
  private ComcastCustomerDetailsMapper comcastCustomerDetailsMapper;
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

				// Save the customer details using the service

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
