package com.topic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.topic.bean.Cate;

public class CateDAO { // 當new一個新物件時，有參數建構子時，必須要給我連線物件

	Connection conn; // 先宣告要有一組連線物件，但尚未實作
	// 連線是別人給他，要有一個有參數的建構子

	public CateDAO(Connection conn) {

		this.conn = conn; // 左邊的this.conn 是自己上面宣告的
	}

	/**
	 * 取得單一筆類別
	 * 
	 * @param Cate_Num
	 * @return
	 * @throws Exception
	 */

//	先嘗試寫一種方法  可以透過 Cate_Name 取得值
	public Cate getOneCateByNum(String Cate_Num) throws Exception {
//		傳入一參數  Cate_Num
		String sql = "SELECT FROM [topic].[dbo].[Cate] where Cate_num = ?";

		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, Cate_Num);

		ResultSet result = psmt.executeQuery();
		result.next();

		Cate cate = new Cate();
		cate.setCate_Num(result.getString("Cate_num"));
		cate.setCate_Name(result.getString("Cate_name"));
		cate.setCate_Desc(result.getString("Cate_Desc"));
		cate.setCate_CDay(result.getString("Cate_CDay"));
		cate.setCate_MDay(result.getString("Cate_MDay"));

		result.close();
		psmt.close();

		return cate; // 一次只會有一筆物件
	}

	/**
	 * 取得所有類別
	 *
	 *
	 *
	 **/
	public ArrayList<Cate> getAllCate() throws Exception {

		String sql = "SELECT FROM [topic].[dbo].[Cate] ";

		PreparedStatement psmt = conn.prepareStatement(sql);

		ResultSet result = psmt.executeQuery();

		ArrayList<Cate> all = new ArrayList<Cate>();

		while (result.next()) {
			Cate cate = new Cate();
			cate.setCate_Num(result.getString("Cate_num"));
			cate.setCate_Name(result.getString("Cate_name"));
			cate.setCate_Desc(result.getString("Cate_Desc"));
			cate.setCate_CDay(result.getString("Cate_CDay"));
			cate.setCate_MDay(result.getString("Cate_MDay"));

			all.add(cate);

		}

		result.close();
		psmt.close();

		return all;

	}
	
	
	
	
	
	

}
