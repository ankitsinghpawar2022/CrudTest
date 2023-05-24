package com.PDB.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundException extends RuntimeException {

	public static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {

	}

	public ResourceNotFoundException(String message, Throwable throwable) {

	}
}
