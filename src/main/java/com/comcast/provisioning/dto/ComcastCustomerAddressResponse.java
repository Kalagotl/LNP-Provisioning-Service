package com.comcast.provisioning.dto;

import java.util.List;

public class ComcastCustomerAddressResponse {
	private List<String> Messages;

	public List<String> getMessages() {
		return Messages;
	}

	public void setMessages(List<String> messages) {
		Messages = messages;
	}
}
