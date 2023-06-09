package com.onlineBookStore.Exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.validation.ConstraintViolationException;


@ControllerAdvice
public class exceptionHandel {

	
	@ExceptionHandler(BookNotFoundException.class)
	
	public ResponseEntity<Object> handleBookNotFoundException(BookNotFoundException ex){
		
		return new ResponseEntity<Object>("there is no book in the data base with the given input id", HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException ex){
		return new ResponseEntity<String>("please check the input details and make sure inpuuts are not nul", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	
	public ResponseEntity<Object> handleNoSuchElementException(NoSuchElementException ex){
		return new ResponseEntity<Object>("there is no order with given id", HttpStatus.BAD_REQUEST);
	}
}
