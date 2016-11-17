package com.cttic.se;

public class TimeoutException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6882990750797111308L;
	public TimeoutException(Exception e) {
		super(e);
	}
	public TimeoutException() {
		super();
	}
	public TimeoutException(String e) {
		super(e);
	}
}
