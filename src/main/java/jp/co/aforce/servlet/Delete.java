package jp.co.aforce.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.bean.Info;
import jp.co.aforce.bean.Message;
import jp.co.aforce.dao.InfoDAO;
import jp.co.aforce.tool.Page;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/jp.co.aforce.servlet/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		Page.header(out);
		

		try {
			InfoDAO dao = new InfoDAO();
			Info info = new Info();
			String memberId = request.getParameter("memberId");
			info.setMemberId(memberId);
			
			
			Message message = new Message();
			String error = "";

			
			String lastName = request.getParameter("lastName");
			String firstName = request.getParameter("firstName");
			String sex = request.getParameter("sex");
			int birthYear = Integer.parseInt(request.getParameter("birthYear"));
			int birthMonth = Integer.parseInt(request.getParameter("birthMonth"));
			int birthDay = Integer.parseInt(request.getParameter("birthDay"));
			String job = request.getParameter("job");
			String phoneNumber = request.getParameter("phoneNumber");
			String mailAddress = request.getParameter("mailAddress");}
		catch(Exception e) {
			
		}

	}

}
