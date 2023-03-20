package Cate;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.topic.dao.CateDAO;


@WebServlet("/ReadCate")
public class ReadCate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ReadCate() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//		 String user = "chief";
//		 String pwd = "117";
		
		
		Connection conn = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:/comp/env/jdbc/servdb");
			conn =ds.getConnection();
			
			
//			Class.forName(jdbcDriver);
//			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;encrypt=false;databaseName=topic",user,pwd);
			
			
			CateDAO CateDAO = new CateDAO();
			String cate_Num = request.getParameter("cate_Num"); 
			
			System.out.println(conn);
			}catch(Exception e) {
			    e.printStackTrace();
			}
		
		
		
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
