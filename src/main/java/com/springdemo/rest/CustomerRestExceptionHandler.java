package com.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	// if we will not found customer we throw exception
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handlerException(CustomerNotFoundException exc){
		
		// tworzymy CustomerErrorResponse
		CustomerErrorResponse error = new CustomerErrorResponse(
				HttpStatus.NOT_FOUND.value(),
				exc.getMessage(),
				System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	// catch all exceptions
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handlerException(Exception exc){
		
		// tworzymy CustomerErrorResponse
		CustomerErrorResponse error = new CustomerErrorResponse(
				HttpStatus.BAD_REQUEST.value(),
				exc.getMessage(),
				System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
