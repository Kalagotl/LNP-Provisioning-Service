package com.comcast.provisioning.Service;

import com.comcast.provisioning.Entity.Comcast_Customer_Details;
import com.comcast.provisioning.Entity.Comcast_Customer_Device;

public interface ComcastProvisioningService {
	
	public void saveCustomerDetails(Comcast_Customer_Details customerDetails);

}
