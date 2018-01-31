package com.internousdev.personal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.personal.dto.InquiryDTO;
import com.internousdev.personal.util.DBConnector;

public class InquiryCompleteDAO {
	private DBConnector db=new DBConnector();
	private Connection connection=db.getConnection();
	private List<InquiryDTO> inquiryDTOList=new ArrayList<InquiryDTO>();

	public int insert(String user_master_id,String qtype,String body){
		int ret=0;
		Connection connection=db.getConnection();

		String sql="INSERT INTO inquiry(user_master_id,qtype,body) VALUES(?,?,?)";
		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,user_master_id);
			ps.setString(2, qtype);
			ps.setString(3, body);
			int i=ps.executeUpdate();
			if(i > 0){
				System.out.println(i + "件登録されました");
				ret=i;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return ret;
	}

	public List<InquiryDTO> select(String user_master_id){
		String sql="SELECT * FROM inquiry WHERE user_master_id=?";
		try{
			Connection connection=db.getConnection();
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, user_master_id);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				InquiryDTO dto=new InquiryDTO();
				dto.setUser_master_id(rs.getString("user_master_id"));
				dto.setQtype(rs.getString("qtype"));
				dto.setBody(rs.getString("body"));
				inquiryDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return inquiryDTOList;
	}

	public int inquiryDelete(String user_master_id)throws SQLException{
		Connection connection=db.getConnection();
		String sql="DELETE FROM inquiry WHERE user_master_id=?";

		PreparedStatement ps;
		int result=0;
		try{
			ps=connection.prepareStatement(sql);
			ps.setString(1, user_master_id);

			result=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}
}