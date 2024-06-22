package com.comcast.provisioning.mapper;

import org.springframework.stereotype.Component;

import com.comcast.provisioning.Entity.Comcast_Customer_Address;
import com.comcast.provisioning.dto.ComcastCustomerAddressRequest;

@Component
public class ComcastCustomerAddressMapper {

    public Comcast_Customer_Address mapCustomerAddress(ComcastCustomerAddressRequest comcastCustomerAddressRequest) {
        Comcast_Customer_Address customerAddress = new com.comcast.provisioning.Entity.Comcast_Customer_Address();
        customerAddress.setDoorNumber(comcastCustomerAddressRequest.getDoorNumber());
        customerAddress.setStreet(comcastCustomerAddressRequest.getStreet());
        customerAddress.setLandmarks(comcastCustomerAddressRequest.getLandmarks());
        customerAddress.setVillage(comcastCustomerAddressRequest.getVillage());
        customerAddress.setMandal(comcastCustomerAddressRequest.getMandal());
        customerAddress.setCity(comcastCustomerAddressRequest.getCity());
        customerAddress.setDistrict(comcastCustomerAddressRequest.getDistrict());
        customerAddress.setState(comcastCustomerAddressRequest.getState());
        customerAddress.setCountry(comcastCustomerAddressRequest.getCountry());

        return customerAddress;
    }
}
