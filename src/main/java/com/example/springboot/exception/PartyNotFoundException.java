package com.example.springboot.exception;

public class PartyNotFoundException extends RuntimeException {
	
	public PartyNotFoundException(Long id) {
		super("Could not find employee " + id);
	}

}
