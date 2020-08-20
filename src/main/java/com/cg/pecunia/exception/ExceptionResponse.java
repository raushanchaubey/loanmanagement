package com.cg.pecunia.exception;

import java.time.LocalDate;

public class ExceptionResponse {

	private LocalDate timeStamp;
	private String message;
	private String details;
	private int code;


	public ExceptionResponse(LocalDate timeStamp, String message, String details, int code) {
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
		this.code = code;
	}

	public LocalDate getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
