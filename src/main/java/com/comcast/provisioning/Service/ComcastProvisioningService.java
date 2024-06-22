package com.comcast.provisioning.Service;

import com.comcast.provisioning.Entity.Comcast_Customer_Details;
import com.comcast.provisioning.Entity.Comcast_Customer_Device;
import com.comcast.provisioning.Entity.Comcast_Customer_plans;

public interface ComcastProvisioningService {
	
	public void saveCustomerDetails(Comcast_Customer_Details customerDetails);
	public void saveCustomerPlansAndDevice(Comcast_Customer_plans customerPlans, Comcast_Customer_Device customerDevice);

}
