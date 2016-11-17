package com.cttic.se;

public class TransportException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -865777797008680483L;

	public TransportException() {
		super();
	}

	public TransportException(Exception e) {
		super(e);
	}

	public TransportException(String e) {
		super(e);
	}
}
