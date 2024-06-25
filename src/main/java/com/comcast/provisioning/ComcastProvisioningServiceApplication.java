package com.comcast.provisioning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.comcast.provisioning")
@EnableJpaRepositories(basePackages = "com.comcast.provisioning.Repository")

public class ComcastProvisioningServiceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ComcastProvisioningServiceApplication.class, args);
	}

}
