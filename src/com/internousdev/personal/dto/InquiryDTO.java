package com.internousdev.personal.dto;

public class InquiryDTO {
	private String user_master_id;
	private String qtype;
	private String body;

	public String getUser_master_id(){
		return user_master_id;
	}
	public void setUser_master_id(String user_master_id){
		this.user_master_id=user_master_id;
	}
	public String getQtype(){
		return qtype;
	}
	public void setQtype(String qtype){
		this.qtype=qtype;
	}
	public String getBody(){
		return body;
	}
	public void setBody(String body){
		this.body=body;
	}
}
