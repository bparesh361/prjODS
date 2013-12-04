package com.fg.ods.entity;

public class Resp {
	
	private int respCode;
	private String respDesc;
	
	public Resp(){
		
	}
	
	public Resp(int respCode, String respDesc){
		this.respCode = respCode;
		this.respDesc = respDesc;
	}
	
	public int getRespCode() {
		return respCode;
	}
	public void setRespCode(int respCode) {
		this.respCode = respCode;
	}
	public String getRespDesc() {
		return respDesc;
	}
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
	
	

}
