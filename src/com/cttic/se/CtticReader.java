package com.cttic.se;


public interface CtticReader {

	public byte[] open(String address, long timeOut, byte[] scanInfo) throws TimeoutException;

	public void close();

	public boolean reopen(long timeOut) throws TimeoutException;

	public void registerConnectCallback(ConnectCallback callback);

	public boolean bind(BindType bindType, String data, String phoneNum) throws ConnectException , TimeoutException;

	public String getAPIVersion();

	public String getDeviceVersion() throws ConnectException;

	public byte[] getDeviceId() throws ConnectException ,TimeoutException;

	public byte[] powerOn(long timeOut) throws ConnectException,
			TimeoutException;
	
	public boolean isPowerOn() throws ConnectException;

	public byte[] exchangeWithData(byte[] data, long timeOut)
			throws TimeoutException, ConnectException, TransportException;

	public boolean powerOff();

	public boolean deleteDevice(String phoneNum) throws DeleteDeviceException;
	
	public enum BindType {
		PRESS_BUTTON,
		KNOCK_BAND,
		AUTH_CODE
	}

}

