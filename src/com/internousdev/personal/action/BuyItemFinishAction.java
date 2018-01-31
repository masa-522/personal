package com.internousdev.personal.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.personal.dao.BuyItemFinishDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemFinishAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private BuyItemFinishDAO buyItemConfirmDAO=new BuyItemFinishDAO();
	//商品購入情報登録メソッド
	public String execute() throws SQLException{
		buyItemConfirmDAO.buyItemInfo(
		session.get("id").toString(),
		session.get("login_user_id").toString(),
		session.get("total_price").toString(),
		session.get("count").toString(),
		session.get("pay").toString());

		String result=SUCCESS;
		return result;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
