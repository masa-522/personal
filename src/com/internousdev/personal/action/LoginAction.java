package com.internousdev.personal.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.personal.dao.LoginDAO;
import com.internousdev.personal.dao.ShowItemDAO;
import com.internousdev.personal.dto.LoginDTO;
import com.internousdev.personal.dto.ShowItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**ログイン認証処理
 * login.jspからloginId,loginPasswordを受け取り
 * DBへ問い合わせを行います。
 *
 * @author internousdev
 * @param loginUserId
 * @param loginPassword
 *
 * @return result
 */

public class LoginAction extends ActionSupport implements SessionAware{
	//ログインID
	private String loginUserId;
	//ログインパスワード
	private String loginPassword;
	//ログイン情報を格納
	public Map<String,Object> session;
	//ログイン情報取得DAO
	private LoginDAO loginDAO=new LoginDAO();
	//ログイン情報格納DTO
	private LoginDTO loginDTO=new LoginDTO();
	//アイテム情報を取得
	private ShowItemDAO showItemDAO=new ShowItemDAO();

	//実行メソッド
	public String execute(){
		String result=ERROR;
		//ログイン実行
		loginDTO=loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", loginDTO);
		//ログイン情報を比較
		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;
			//アイテム情報を取得
			ShowItemDTO showItemDTO=showItemDAO.getShowItemInfo();
			session.put("login_user_id",loginDTO.getLoginId());
			session.put("id",showItemDTO.getId());
			session.put("buyItem_name",showItemDTO.getItemName());
			session.put("buyItem_price", showItemDTO.getItemPrice());

			return result;
		}
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
