package com.springdemo.rest;

public class CustomerErrorResponse {

	private int id;
	private String message;
	private long timeStamp;
	
	public CustomerErrorResponse() {}

	public CustomerErrorResponse(int id, String message, long timeStamp) {
		super();
		this.id = id;
		this.message = message;
		this.timeStamp = timeStamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	
}
	
	
