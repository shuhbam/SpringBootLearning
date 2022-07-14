package com.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserIsMandatoryException extends RuntimeException {

	public UserIsMandatoryException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
