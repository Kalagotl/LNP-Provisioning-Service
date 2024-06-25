package com.comcast.provisioning.mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.comcast.provisioning.Entity.Comcast_Customer_Address;
import com.comcast.provisioning.Entity.Comcast_Customer_Details;
import com.comcast.provisioning.dto.ComcastCustomerAddressRequest;
import com.comcast.provisioning.dto.ComcastCustomerDetailsRequest;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ComcastCustomerDetailsMapper {

	@Autowired
	private ComcastCustomerAddressMapper addressMapper;

	public Comcast_Customer_Details mapCustomerDetails(ComcastCustomerDetailsRequest comcastCustomerDetailsRequest) {
		Comcast_Customer_Details customerDetails = new Comcast_Customer_Details();
		customerDetails.setCustomerName(comcastCustomerDetailsRequest.getCustomerName());
		customerDetails.setEmail(comcastCustomerDetailsRequest.getEmail());
		customerDetails.setPhoneNumber(comcastCustomerDetailsRequest.getPhoneNumber());
		customerDetails.setTransactionId(Long.valueOf(comcastCustomerDetailsRequest.getTransactionId()));
		customerDetails.setDateOfBirth(comcastCustomerDetailsRequest.getDateOfBirth());
		customerDetails.setGender(comcastCustomerDetailsRequest.getGender());
		customerDetails.setPassport(comcastCustomerDetailsRequest.getPassport());
		customerDetails.setCustomerActiveDate(comcastCustomerDetailsRequest.getCustomerActiveDate());
		customerDetails.setStatus(comcastCustomerDetailsRequest.getStatus());
		customerDetails.setPlanName(comcastCustomerDetailsRequest.getPlanName());
		customerDetails.setIccid(comcastCustomerDetailsRequest.getIccid());

		List<Comcast_Customer_Address> customerAddresses = comcastCustomerDetailsRequest.getCustomerAddresses().stream()
				.map(addressMapper::mapCustomerAddress)
				.collect(Collectors.toList());

		customerDetails.setCustomerAddresses(customerAddresses);

		// Ensure bi-directional relationship
		customerAddresses.forEach(address -> address.setCustomerDetails(customerDetails));

		return customerDetails;
	}
}
