package com.internousdev.personal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.personal.util.DBConnector;
import com.internousdev.personal.util.DateUtil;

public class UserCreateCompleteDAO {
	private DBConnector db=new DBConnector();
	private Connection connection=db.getConnection();
	private DateUtil date=new DateUtil();

	private String sql="INSERT INTO login_user_transaction(login_id,login_pass,user_name,insert_date)"
			+ "VALUES(?,?,?,?)";

	public void createUser(String loginUserId,String loginUserPassword,String userName)throws SQLException{
		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginUserPassword);
			ps.setString(3, userName);
			ps.setString(4, date.getDate());

			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}