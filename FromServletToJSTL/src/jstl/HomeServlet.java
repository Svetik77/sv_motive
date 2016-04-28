package jstl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classik.Employee;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter pr = response.getWriter();
				pr.println("");
				 List<Employee> empList = new ArrayList<Employee>();
			        Employee emp1 = new Employee();
			        emp1.setId(1);
			        emp1.setName("Pankaj");
			        emp1.setRole("Developer");
			       
			        Employee emp2 = new Employee();
			        emp2.setId(2);
			        emp2.setName("Meghna");
			        emp2.setRole("Manager");
			        empList.add(emp1);
			        empList.add(emp2);
			        
			        request.setAttribute("empList", empList);
			         
			        request.setAttribute("htmlTagData", "<br/> creates a new line.");
			        request.setAttribute("url", "http://www.journaldev.com");
			        RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
			        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
