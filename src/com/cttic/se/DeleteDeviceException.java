package com.cttic.se;

public class DeleteDeviceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3487628058208686773L;
	
	public DeleteDeviceException(Exception e) {
		super(e);
	}
	public DeleteDeviceException() {
		super();
	}
	public DeleteDeviceException(String e) {
		super(e);
	}
}
