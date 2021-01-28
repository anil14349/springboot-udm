package com.example.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PartyNotFoundAdvice {

	@ResponseBody
	  @ExceptionHandler(PartyNotFoundException.class)
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  String partyNotFoundHandler(PartyNotFoundException ex) {
	    return ex.getMessage();
	  }
	
}
