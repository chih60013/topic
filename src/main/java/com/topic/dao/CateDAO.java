package com.topic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.topic.bean.CateBean;

public class CateDAO { // 當new一個新物件時，有參數建構子時，必須要給我連線物件

	Connection conn; // 先宣告要有一組連線物件，但尚未實作
	// 連線是別人給他，要有一個有參數的建構子

	public CateDAO() {
	}

//	  conn 最簡易方式   直接全部寫在 方法裡面 像 read all
	// Context context = new InitialContext();
//	DataSource ds = (DataSource)context.lookup("java:/comp/env/jdbc/servdb");
//	conn =ds.getConnection();

	/**
	 * 取得單一筆類別
	 * 
	 * @param Cate_Num
	 * @return
	 * @throws Exception
	 */

//	先嘗試寫一種方法  可以透過 Cate_Name 取得值
	public CateBean getOneCateByNum(String Cate_Num) throws Exception {
//		傳入一參數  Cate_Num
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("java:/comp/env/jdbc/servdb");
		conn = ds.getConnection();
		
		
		String sql = "SELECT * FROM [topic].[dbo].[Cate] where Cate_num = ?";

		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, Cate_Num);

		ResultSet result = psmt.executeQuery();
		result.next();

		CateBean cate = new CateBean();
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
	public ArrayList<CateBean> getAllCate() {

		Connection conn = null;

		String sql = "select * from [topic].[dbo].[Cate]";
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:/comp/env/jdbc/servdb");
			conn = ds.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql); // 連線物件 準備執行sql語句
			ResultSet rs = psmt.executeQuery();
			ArrayList<CateBean> cates = new ArrayList<>();
			CateBean cate = null;
			while (rs.next()) {
				cate = new CateBean();
				cate.setCate_Num(rs.getString("Cate_Num"));
				cate.setCate_Name(rs.getString("Cate_Name"));
				cate.setCate_Desc(rs.getString("Cate_Desc"));
				cate.setCate_CDay(rs.getString("Cate_CDay"));
				cate.setCate_MDay(rs.getString("Cate_MDay"));
				cates.add(cate);
			}
			psmt.close();

			return cates;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;

	}

	// 刪除類別

	public boolean DeleteCate(String CateNum) {

		String sql = "DELETE  FROM [dbo].[Cate]  WHERE [Cate_Num]= ? ";
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:/comp/env/jdbc/servdb");
			conn = ds.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, CateNum); // 到這邊 其實已經刪除成功

			int result = psmt.executeUpdate();
			if (result >= 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return false;

	}

	// 新增類別
	public boolean CreateCate(CateBean cate) { // 括號中的 CateBean 表示這個方法接受一個 CateBean 型別的參數，而 cate 則是傳入的這個 CateBean 物件的名稱。
//簡單來說，這個方法是用來新增 CateBean 物件中的資料到 MSSQL 資料庫中的 Cate 表格，方法會返回一個 boolean 值，表示新增是否成功。在方法中，使用了 JDBC 來執行 INSERT 陳述式，並使用 PreparedStatement 物件來設定 INSERT 陳述式中的參數值。
//因此，這個方法是用來操作 MSSQL 資料庫的 Cate 表格的，其接受一個 CateBean 物件作為參數，該物件包含了要新增到資料庫中的 Cate 資料表中的資料。

		String sql = "INSERT INTO [dbo].[Cate]\r\n" + "           ([Cate_Num]\r\n" + "           ,[Cate_Name]\r\n"
				+ "           ,[Cate_Desc]\r\n" + "           ,[Cate_CDay]\r\n" + "           ,[Cate_MDay])"
				+ " VALUES(?,?,?,?,?)";

		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:/comp/env/jdbc/servdb");
			conn = ds.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, cate.getCate_Num());
			psmt.setString(2, cate.getCate_Name());
			psmt.setString(3, cate.getCate_Desc());
			psmt.setString(4, cate.getCate_CDay());
			psmt.setString(5, cate.getCate_MDay());

			int result = psmt.executeUpdate();
			if (result >= 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	//r
	
	public boolean UpdateCate(CateBean cate) {

		String sql = "UPDATE [dbo].[Cate]\r\n" + "   SET "
				+ "      [Cate_Name] = ?" + "      ,[Cate_Desc] =?"
				+ "      ,[Cate_CDay] = ?" + "      ,[Cate_MDay] = ?"
				+ " WHERE Cate_Num=?";
		Context context;
		try {
			context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:/comp/env/jdbc/servdb");
			conn = ds.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, cate.getCate_Name());
			psmt.setString(2, cate.getCate_Desc());
			psmt.setString(3, cate.getCate_CDay());
			psmt.setString(4, cate.getCate_MDay());
			psmt.setString(5,cate.getCate_Num());
			
			int updateCount = psmt.executeUpdate();
			if(updateCount>=1) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

}
