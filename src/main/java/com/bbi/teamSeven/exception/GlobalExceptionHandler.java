package com.bbi.teamSeven.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> resourceNotFoundExceptionHandler(RuntimeException ex) {
		String message ="Improper input data";
		return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
	}
}
