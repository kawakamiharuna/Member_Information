package jp.co.aforce.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

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
 * Servlet implementation class Registration
 */
@WebServlet(urlPatterns = { "/registration/registration" })
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("../views/registration.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();
		Page.header(out);

		//HttpSession session = request.getSession();

		try {
			InfoDAO dao = new InfoDAO();
			Info info = new Info();
			Message message = new Message();
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			SimpleDateFormat sdf = new SimpleDateFormat("yyMMddSSss");
			//HttpSession session = request.getSession();
			String memberId = sdf.format(timestamp);
			
			String lastName = request.getParameter("lastName");
			String firstName = request.getParameter("firstName");
			String sex = request.getParameter("sex");

			int birthYear = Integer.parseInt(request.getParameter("birthYear"));
			int birthMonth = Integer.parseInt(request.getParameter("birthMonth"));
			int birthDay = Integer.parseInt(request.getParameter("birthDay"));
			String job = request.getParameter("job");
			String phoneNumber = request.getParameter("phoneNumber");
			String mailAddress = request.getParameter("mailAddress");
			
			info.setMemberId(memberId);
			info.setLastName(lastName);
			info.setFirstName(firstName);
			info.setSex(sex);
			info.setBirthYear(birthYear);
			info.setBirthMonth(birthMonth);
			info.setBirthDay(birthDay);
			info.setJob(job);
			info.setPhoneNumber(phoneNumber);
			info.setMailAddress(mailAddress);
			
			int counts = dao.check(lastName, firstName, sex, birthYear, birthMonth,birthDay, job, phoneNumber, mailAddress);
			

			 if(counts >= 1) {
				message.setWCMM2("登録");
				out.println("最初からやり直してください。");
				response.sendRedirect("../views/registration.jsp");

			} else {
				
				dao.insert(info);
				request.setAttribute("info", info);
//				session.setAttribute("memberId", memberId);
//				session.setAttribute("lastName", lastName);
//				session.setAttribute("firstName", firstName);
//				session.setAttribute("sex", sex);
//				session.setAttribute("birthYear", birthYear);
//				session.setAttribute("birthMonth", birthMonth);
//				session.setAttribute("birthDay", birthDay);
//				session.setAttribute("job", job);
//				session.setAttribute("phoneNumber", phoneNumber);
//				session.setAttribute("mailAddress", mailAddress);

				response.sendRedirect("../views/registration-in.jsp");
			}

		} catch (Exception e) {
			out.println("エラー" + e);
			e.printStackTrace();

		}
		Page.footer(out);

	}

}
