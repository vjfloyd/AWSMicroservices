package com.enel.ms.qr.login.http;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenericResponse implements Serializable {
	
	private static final long serialVersionUID = -3292006534876610159L;
	@JsonProperty("hr")
	private HeaderResponse hr;
	@JsonProperty("br")
	private BodyResponse br;
	
	public GenericResponse() {
	}
	
	public GenericResponse(HeaderResponse hr, BodyResponse br) {
		super();
		this.hr = hr;
		this.br = br;
	}
	public HeaderResponse getHr() {
		return hr;
	}
	public void setHr(HeaderResponse hr) {
		this.hr = hr;
	}
	public BodyResponse getBr() {
		return br;
	}
	public void setBr(BodyResponse br) {
		this.br = br;
	}
	 
	

}
