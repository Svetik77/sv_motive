package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet  LemonListik
 */
@WebServlet("/LemonListik")
public class LemonListik extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LemonListik() {
        super();
    }

	// 192.168.0.10
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter pr = response.getWriter();
				pr.println("");
				
				String loginName = request.getParameter("loginName");
				String prodName = request.getParameter("prodName");
				
				HttpSession session = request.getSession();
				session.setAttribute("loginName", loginName);
				session.setAttribute("prodName", prodName);
				request.getRequestDispatcher("/displaySession.jsp").forward(
						request, response);
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
