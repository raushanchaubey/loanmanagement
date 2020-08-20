package com.cg.pecunia.exception;



import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleExceptions(Exception ex, WebRequest request) throws Exception {
		ExceptionResponse response = new ExceptionResponse(LocalDate.now(), ex.getMessage(),
				request.getDescription(false), 400);
		return new ResponseEntity<Object>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
