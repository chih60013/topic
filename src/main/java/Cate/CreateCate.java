package Cate;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCate
 */
@WebServlet("/CreateCate")
public class CreateCate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CreateCate() {
        super();
        // TODO Auto-generated constructor stub
    }

    Connection conn = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Cate_Num = request.getParameter("Cate_Num");
		String Cate_Name = request.getParameter("Cate_Name");
		String Cate_Desc = request.getParameter("Cate_Desc");
		String Cate_CDay = request.getParameter("Cate_CDay");
		String Cate_MDay = request.getParameter("Cate_MDay");
		
		
		
		
		
		
		
		
		
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
