package com.internousdev.personal.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.personal.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{
	private String itemName;
	private String itemPrice;
	private String itemStock;
	public Map<String,Object>session;
	private String result;
	private ItemCreateCompleteDAO itemCreateCompleteDAO=new ItemCreateCompleteDAO();

	//商品情報登録処理
	public String execute()throws SQLException{
		int intItemPrice=Integer.parseInt(session.get("itemPrice").toString());
		int intItemStock=Integer.parseInt(session.get("itemStcok").toString());

		itemCreateCompleteDAO.createItem(session.get("itemName").toString(),
				intItemPrice,
				intItemStock);

			result=SUCCESS;
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
	public String getItemStock(){
		return itemStock;
	}
	public void setItemStock(String itemStock){
		this.itemStock=itemStock;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
