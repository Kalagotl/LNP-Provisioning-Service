package com.comcast.provisioning.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comcast.provisioning.dto.ComcastCustomerDetailsRequest;


@RestController
@RequestMapping("/comcast")
public class ComcastProvisioningController {
	
	@PostMapping("/provisioning")
	public  ResponseEntity<String> Provisioning(@RequestBody ComcastCustomerDetailsRequest comcastRequest) {
		
		
		
		
		 return ResponseEntity.ok("Provisioning initiated successfully");
	}
}
