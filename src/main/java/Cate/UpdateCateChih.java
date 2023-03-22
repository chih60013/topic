package Cate;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.topic.bean.CateBean;
import com.topic.dao.CateDAO;

/**
 * Servlet implementation class CreateCate
 */
@WebServlet("/UpdateCateChih")
public class UpdateCateChih extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UpdateCateChih() {
        super();
        // TODO Auto-generated constructor stub
    }

    Connection conn = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		
		String cateNum = request.getParameter("cateNum");
		boolean isUpdateSuccess;
		CateBean Upcate = new CateBean();
		Upcate.setCate_Num(cateNum);
		Upcate.setCate_Name(request.getParameter("cateName"));
		Upcate.setCate_Desc(request.getParameter("cateDesc"));
		Upcate.setCate_CDay(request.getParameter("cateCDay"));
		Upcate.setCate_MDay(request.getParameter("cateMDay"));
		
		CateDAO cate=new CateDAO();
		isUpdateSuccess= cate.UpdateCate(Upcate);
		
				
		request.setAttribute("isUpdateSuccess", isUpdateSuccess);
		request.getRequestDispatcher("./topichtml/UpdateCateFinish.jsp")
		.forward(request, response);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
