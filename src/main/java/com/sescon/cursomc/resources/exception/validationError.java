package com.sescon.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class validationError extends StandardError {
	private static final long serialVersionUID = 1L;

	private List<FieldMessage> errors = new ArrayList<>();

	public validationError(Integer status, String message, Long timeStamp) {
		super(status, message, timeStamp);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String messagem) {
		errors.add(new FieldMessage(fieldName, messagem));
	}
	
	

}
