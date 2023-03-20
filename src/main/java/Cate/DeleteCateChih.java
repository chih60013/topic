package Cate;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.topic.bean.CateBean;
import com.topic.dao.CateDAO;

/**
 * Servlet implementation class DeleteCateChih
 */
@WebServlet("/DeleteCateChih")
public class DeleteCateChih extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DeleteCateChih() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String cateNum = request.getParameter("CateNum");
		boolean isDeleteSuccess; 	//因為方法有寫一個boolean判斷
		
		
		
		CateDAO cate=new CateDAO();
		isDeleteSuccess= cate.DeleteCate(cateNum);  //到這邊已經刪除成功!
		//右邊會ruturn true or false 把他指定為左邊的變數
		System.out.println(cateNum);
		request.setAttribute("isDeleteSuccess", isDeleteSuccess);
		request.getRequestDispatcher("./topichtml/DeleteCate.jsp")
		.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
