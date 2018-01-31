package com.internousdev.personal.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.personal.dao.ShowItemDAO;
import com.internousdev.personal.dto.ShowItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class StartAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	//ログイン画面へ遷移
	public String execute(){
		String result="login";
		if(session.containsKey("id")){
			//アイテム情報を取得
			ShowItemDAO showItemDAO=new ShowItemDAO();
			ShowItemDTO showItemDTO=showItemDAO.getShowItemInfo();
			session.put("id",showItemDTO.getId());
			session.put("buyItem_name",showItemDTO.getItemName());
			session.put("buyItem_price", showItemDTO.getItemPrice());

			result=SUCCESS;
		}
		return result;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}
}
