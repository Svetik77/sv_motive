package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyCookie
 */
@WebServlet("/MyCookie")
public class MyCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  private static final String VIEW = "show2.jsp";
	  
	  
    public MyCookie() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		pr.println("");
		String loginName = request.getParameter("loginName");
		String prodName = request.getParameter("prodName");
		int gramm = Integer.parseInt(request.getParameter("gramm"));
		
		Cookie cookie = new Cookie("loginName", loginName);
		cookie.setMaxAge(365*24*60);
		response.addCookie(cookie);
		
//		request.setAttribute("loginName", loginName);
		request.setAttribute("prodName", prodName);
		request.setAttribute("gramm", gramm);
		
		 RequestDispatcher dispatcher = request.getRequestDispatcher(VIEW);

	        dispatcher.forward(request, response);
}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

doGet(request, response);
}

}
