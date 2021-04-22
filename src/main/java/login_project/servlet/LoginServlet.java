package login_project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login_project.dto.Member;
import login_project.service.LoginService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	LoginService loginService = new LoginService();
	Member loginMember = loginService.getLogin(id, passwd);
	
	if(loginMember != null) {
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		response.sendRedirect("index.jsp");
	}else {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("alert('로그인 실패')");
		out.println("history.back();");
		out.println("</script>");
		out.close();
	}
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
