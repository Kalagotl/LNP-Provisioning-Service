package com.comcast.provisioning.mapper;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comcast.provisioning.Entity.Comcast_Corporation_Details;
import com.comcast.provisioning.Entity.Comcast_Customer_Address;
import com.comcast.provisioning.Entity.Comcast_Customer_Details;
import com.comcast.provisioning.dto.ComcastCustomerAddressRequest;
import com.comcast.provisioning.dto.ComcastCustomerDetailsRequest;

@Component
public class ComcastCustomerDetailsMapper 
{
	@Autowired
	private ComcastCustomerAddressMapper comcastCustomerAddressMapper;
	
	
    public Comcast_Customer_Details mapCustomerDetails(ComcastCustomerDetailsRequest comcastCustomerDetailsRequest ) 
    {
    	 Comcast_Customer_Details  comcast_Customer_Details = new  Comcast_Customer_Details();
    	 
    		comcast_Customer_Details.setCustomerName(comcastCustomerDetailsRequest.getCustomerName());
    		comcast_Customer_Details.setEmail(comcastCustomerDetailsRequest.getEmail());
    		comcast_Customer_Details.setPhoneNumber(comcastCustomerDetailsRequest.getPhoneNumber());
    		comcast_Customer_Details.setDateOfBirth(comcastCustomerDetailsRequest.getDateOfBirth());
    		comcast_Customer_Details.setGender(comcastCustomerDetailsRequest.getGender());
    		comcast_Customer_Details.setPassport(comcastCustomerDetailsRequest.getPassport());
    		comcast_Customer_Details.setCustomerActiveDate(comcastCustomerDetailsRequest.getCustomerActiveDate());
    		comcast_Customer_Details.setCustomerDeactiveDate(comcastCustomerDetailsRequest.getCustomerDeactiveDate());
            comcast_Customer_Details.setPlan(comcastCustomerDetailsRequest.getPlan());
    	 
        
    	 if(comcastCustomerDetailsRequest.getComcastCustomerAddressRequest()!=null) 
    	 {
    		 List<Comcast_Customer_Address> comcast_Customer_Address  = (List<Comcast_Customer_Address>) comcastCustomerAddressMapper.addressMapper(comcastCustomerDetailsRequest.getComcastCustomerAddressRequest().get(0));
    		comcast_Customer_Details.setAddresses(comcast_Customer_Address);
    	 }                                     
    	 
    	return comcast_Customer_Details;
    }
	
	
	
}
