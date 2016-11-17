package com.cttic.se;

public class ConnectException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9185401205976357236L;
	
	public ConnectException(Exception e) {
		super(e);
	}
	
	public ConnectException() {
		super();
	}

	public ConnectException(String e) {
		super(e);
	}
}
