package com.comcast.provisioning.mapper;
import com.comcast.provisioning.dto.ComcastCustomerAddressRequest;
import org.springframework.stereotype.Component;

import com.comcast.provisioning.Entity.Comcast_Customer_Address;
import com.comcast.provisioning.dto.ComcastCustomerDetailsRequest;
@Component
public class ComcastCustomerAddressMapper {

 public Comcast_Customer_Address  addressMapper(ComcastCustomerAddressRequest comcastCustomerAddressRequest) 
 {

	   
	 Comcast_Customer_Address comcast_Customer_Address = new Comcast_Customer_Address();
	 comcast_Customer_Address.setDoorNumber(comcastCustomerAddressRequest.getDoorNumber());
	 comcast_Customer_Address.setStreet(comcastCustomerAddressRequest.getStreet());
	 comcast_Customer_Address.setLandmarks(comcastCustomerAddressRequest.getLandmarks());
	 comcast_Customer_Address.setVillage(comcastCustomerAddressRequest.getVillage());
	 comcast_Customer_Address.setCity(comcastCustomerAddressRequest.getCity());
	 comcast_Customer_Address.setMandal(comcastCustomerAddressRequest.getMandal());
	 comcast_Customer_Address.setDistrict(comcastCustomerAddressRequest.getDistrict());
	 comcast_Customer_Address.setState(comcastCustomerAddressRequest.getState());
	 comcast_Customer_Address.setCountry(comcastCustomerAddressRequest.getCountry());
	 
	 return comcast_Customer_Address;
	 
 }
}
