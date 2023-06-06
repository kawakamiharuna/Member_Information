package jp.co.aforce.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.bean.Info;
import jp.co.aforce.bean.Message;
import jp.co.aforce.dao.InfoDAO;
import jp.co.aforce.tool.Page;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
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
		HttpSession session = request.getSession();
		InfoDAO dao = new InfoDAO();
		Info info = new Info();
		Message message = new Message();
		
		if (info.getLastName() != null) {
			info.setLastName(info.getLastName());
		}

		if (info.getFirstName() != null) {
			info.setFirstName(info.getFirstName());
		}

		if (info.getSex() != null) {
			info.setSex(info.getSex());
		}

		if (info.getBirthYear() != info.getBirthYear()) {
			info.setBirthYear(info.getBirthYear());
		}
		if (info.getBirthMonth()!= info.getBirthMonth()) {
			info.setBirthMonth(info.getBirthMonth());
		}

		if (info.getBirthDay() != info.getBirthDay()) {
			info.setBirthDay(info.getBirthDay());
		}
		if (info.getJob() != null) {
			info.setJob(info.getJob());
		}
		if (info.getPhoneNumber() != null) {
			info.setPhoneNumber(info.getPhoneNumber());
		}
		if (info.getMailAddress() != null) {
			info.setMailAddress(info.getMailAddress());
		}
	}

}
