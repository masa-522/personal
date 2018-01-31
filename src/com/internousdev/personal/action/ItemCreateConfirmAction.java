package com.internousdev.personal.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{
	private String itemName;
	private String itemPrice;
	private int itemStock;
	public Map<String,Object> session;
	private String result;
	private String errorMessage;

	//入力情報格納処理
	public String execute(){
		result=SUCCESS;


			session.put("itemName", itemName);
			session.put("itemPrice",itemPrice);
			session.put("itemStock",itemStock);
		return result;
	}
	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}
	public String getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice=itemPrice;
	}
	public int getItemStock(){
		return itemStock;
	}
	public void setItemStock(int itemStock){
		this.itemStock=itemStock;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage=errorMessage;
	}
}

