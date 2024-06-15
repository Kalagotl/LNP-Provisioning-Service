package com.comcast.provisioning.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comcast")
public class ComcastProvisioningController {
	
	@PostMapping("/provisioning")
    public  String Provisioning(@RequestBody LNP_Service_Details request) {
        // Call service layer method to initiate provisioning
       
        return null;
    }
}
