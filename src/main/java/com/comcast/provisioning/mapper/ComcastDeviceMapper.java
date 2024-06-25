package com.comcast.provisioning.mapper;

import com.comcast.provisioning.Entity.Comcast_Customer_Device;
import com.comcast.provisioning.Entity.Comcast_Device_Details;
import com.comcast.provisioning.Repository.ComcastDeviceDetailsRepository;
import com.comcast.provisioning.dto.ComcastCustomerDetailsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ComcastDeviceMapper {

    @Autowired
    private ComcastDeviceDetailsRepository comcastDeviceDetailsRepository;

    public Comcast_Customer_Device map(ComcastCustomerDetailsRequest request) {
        Optional<Comcast_Device_Details> deviceDetailsOpt;
        Comcast_Customer_Device customerDevice = new Comcast_Customer_Device();
        try {
            deviceDetailsOpt = comcastDeviceDetailsRepository.findByIccid(request.getIccid());
            if (deviceDetailsOpt.isPresent()) {
                Comcast_Device_Details deviceDetails = deviceDetailsOpt.get();
                customerDevice.setIccid(deviceDetails.getIccid());
                customerDevice.setDeviceName(deviceDetails.getDeviceName());
                customerDevice.setDeviceType(deviceDetails.getDeviceType());
                customerDevice.setSku(deviceDetails.getSku());
                customerDevice.setUpc(deviceDetails.getUpc());
                customerDevice.setActivationDate(deviceDetails.getActivationDate());
                customerDevice.setStatus(deviceDetails.getStatus());
            } else {
                throw new RuntimeException("Device details not found for ICCID: " + request.getIccid());
            }
        } catch (Exception e) {
            // Handle the exception, log, or rethrow as needed
            throw new RuntimeException("Error occurred while mapping device details: " + e.getMessage(), e);
        }
        return customerDevice;
    }
}
