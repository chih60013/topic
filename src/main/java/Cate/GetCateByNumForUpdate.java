package Cate;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

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
@WebServlet("/GetCateByNumForUpdate")
public class GetCateByNumForUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetCateByNumForUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}

	Connection conn = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		try {
			String CateNum = request.getParameter("CateNum");
			CateDAO cateDAO = new CateDAO();
			CateBean cateBean = cateDAO.getOneCateByNum(CateNum);
			request.setAttribute("cate", cateBean);
			request.getRequestDispatcher("./topichtml/FindCateByNumForUpdate.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
