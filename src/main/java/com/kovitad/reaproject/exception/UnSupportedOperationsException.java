package com.kovitad.reaproject.exception;

public class UnSupportedOperationsException extends UnsupportedOperationException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -439936230825159976L;
	
	public UnSupportedOperationsException(String message) {
		super("Unsupported Operations Error : "+message);
	}
	
}
