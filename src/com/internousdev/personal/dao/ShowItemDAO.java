package com.internousdev.personal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.personal.dto.ShowItemDTO;
import com.internousdev.personal.util.DBConnector;

public class ShowItemDAO {
	private DBConnector db=new DBConnector();
	private Connection connection=db.getConnection();
	private ShowItemDTO showItemDTO=new ShowItemDTO();

	//商品情報取得メソッド
	public ShowItemDTO getShowItemInfo(){
		String sql="SELECT id,item_name,item_price FROM item_info_transaction";
		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				showItemDTO.setId(rs.getInt("id"));
				showItemDTO.setItemName(rs.getString("item_name"));
				showItemDTO.setItemPrice(rs.getString("item_price"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return showItemDTO;
	}
	public ShowItemDTO getShowItemDTO(){
		return showItemDTO;
	}
}