package com.comcast.provisioning.dto;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class ComcastCustomerDetailsResponse {
 private List<String> Messages;

public List<String> getMessages() {
	return Messages;
}

public void setMessages(List<String> messages) {
	Messages = messages;
}

}
