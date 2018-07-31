package com.enel.ms.qr.login.lambda;

public class LoginResponse {

	private String name;
	private String carrer;
	
	
	public LoginResponse() {
		super();
	}
	public LoginResponse(String name, String carrer) {
		super();
		this.name = name;
		this.carrer = carrer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCarrer() {
		return carrer;
	}
	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}
	
	
}
