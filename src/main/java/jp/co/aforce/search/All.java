package jp.co.aforce.search;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class All
 */
@WebServlet("/co.jp.aforce.search/all")
public class All extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public All() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html; UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		try {
			InitialContext ic=new InitialContext();
			DataSource ds=(DataSource)ic.lookup(
					"java:/comp/env/jdbc/MemberInfomation");
			Connection con=ds.getConnection();
			
			PreparedStatement st=con.prepareStatement(
					"select * from MemberInfo");
			ResultSet rs=st.executeQuery();
			
			while(rs.next()){
				out.println(rs.getInt("BirthDay"));
				out.println(":");
				out.println(rs.getString("LastName"));
				out.println(":");
				out.println(rs.getString("Job"));
				out.println(":");
				out.println(rs.getString("MemberId"));
				
				out.println("<br>");
			}
			
			st.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace(out);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
