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
@WebServlet("/CreateCate")
public class CreateCate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CreateCate() {
        super();
        // TODO Auto-generated constructor stub
    }

    Connection conn = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		CateBean cateBean = new CateBean();
		cateBean.setCate_Num(request.getParameter("CateNum"));
		cateBean.setCate_Name(request.getParameter("Catename"));
		cateBean.setCate_Desc(request.getParameter("CateDesc"));
		cateBean.setCate_CDay(request.getParameter("CateCDay"));
		cateBean.setCate_MDay(request.getParameter("CateMDay"));
		
//		System.out.println(cateBean.getCate_Num());
		
		CateDAO cate=new CateDAO();
		cate.CreateCate(cateBean);
		//到這邊已經完成寫入
		
		
		
		request.setAttribute("cateBean", cateBean);
		request.getRequestDispatcher("./topichtml/CreateCate.jsp")
		.forward(request, response);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
