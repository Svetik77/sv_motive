package jstl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**http://stackoverflow.com/questions/15522149/jstl-iterating-through-array-of-random-integers-not-displaying-in-webpage
 * Servlet implementation class JSTLServlet
 */
@WebServlet("/JSTLServlet")
public class JSTLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	private static final String VIEW = "WEB-INF/JSP/JSTL.jsp";
	private static final String VIEW = "JSTL.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		pr.println("");

		RequestDispatcher dispatcher = request.getRequestDispatcher(VIEW);

		// =======below is the code using
		// Array=====================================
		int[] myList = new int[42];
		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int) (Math.random() * 100);
		}
		request.setAttribute("mylist", myList);

		// =======below is the code using
		// ArrayList=====================================   
		List<String> names = Arrays.asList("John", "Georges", "Kevin");

		request.setAttribute("names", names);

		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
