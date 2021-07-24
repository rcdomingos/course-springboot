package com.rcdomingos.course.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.rcdomingos.course.services.exceptions.DatabaseException;
import com.rcdomingos.course.services.exceptions.ResourceNotFoundException;

@ControllerAdvice //interceptar as exceçoes para que possa executar um possivel tratamento
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)//interceptar qualquer excption desse tipo
	public ResponseEntity<StandardError> resorceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class)//interceptar qualquer excption desse tipo
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request){
		String error = "Database not found";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}

