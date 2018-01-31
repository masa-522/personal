package com.internousdev.personal.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.personal.dao.InquiryCompleteDAO;
import com.internousdev.personal.dto.InquiryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class InquiryCompleteAction extends ActionSupport implements SessionAware{
	private String user_master_id;
	private String qtype;
	private String body;
	InquiryCompleteDAO inquiryCompletedao=new InquiryCompleteDAO();
	List<InquiryDTO> inquiryDTOList=new ArrayList<InquiryDTO>();
	private Map<String,Object> session;
	private String deleteFlg;
	private String message;

	public void delete() throws SQLException{
		String user_master_id=session.get("login_user_id").toString();

		int res=inquiryCompletedao.inquiryDelete(user_master_id);
		if(res > 0){
			inquiryDTOList=null;
			setMessage("お問い合わせを削除しました。");
		}else if(res == 0){
			setMessage("お問い合わせの削除に失敗しました。");
		}
	}

	public String execute()throws SQLException{
		if(!session.containsKey("id")){
			return ERROR;
		}

		if(deleteFlg == null){
		int count=inquiryCompletedao.insert(
				session.get("login_user_id").toString(),
				qtype,
				body);
		if(count > 0){
			inquiryDTOList=inquiryCompletedao.select(session.get("login_user_id").toString());
			session.put("inquiryDTOList", inquiryDTOList);
			}
		}else if(deleteFlg.equals("1")){
			delete();
		}

		String result=SUCCESS;
		return result;
	}

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
	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public String getDeleteFlg(){
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg=deleteFlg;
	}
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}

}
