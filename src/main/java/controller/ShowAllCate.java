package controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.topic.dao.CateDAO;
import com.topic.bean.CateBean;

//這支的用途 是讓使用者 使用此 servlet 可以獲得所有使用者的資料
@WebServlet("/ShowAllCate")
public class ShowAllCate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowAllCate() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
	
			CateDAO cate=new CateDAO();
			ArrayList<CateBean>cates=cate.getAllCate();
					
			request.setAttribute("cates", cates);  //要帶走的東西 後面會用到 前面是名稱   
			request.getRequestDispatcher("./topichtml/ShowAllCateFinish.jsp")
			.forward(request, response);
			
			HttpSession session = request.getSession();
			session.setAttribute("cates", cates);
			response.sendRedirect("./topichtml/ShowAllCateFinish.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
