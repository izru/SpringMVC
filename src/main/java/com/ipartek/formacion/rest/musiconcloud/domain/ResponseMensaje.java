package com.ipartek.formacion.rest.musiconcloud.domain;

public class ResponseMensaje {
	private String info;

	public ResponseMensaje() {
		super();
		this.info="";
	}
	
	public ResponseMensaje(String info) {
		super();
		this.info=info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	

}
