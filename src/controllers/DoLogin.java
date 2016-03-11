package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.CustomerMap;
import beans.Customer;

/**
 * Servlet implementation class Login
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String customerId = request.getParameter("customerId");
		
		CustomerMap service = new CustomerMap();
	    Customer customer = service.findCustomer(customerId);
	    request.setAttribute("customer", customer);
	    
	    String address;
	    if (customer == null) {
	      request.setAttribute("badId", customerId);
	      address = "/jsps/error.jsp";
	    } else  {
	      address = "/jsps/success.jsp";
	    } 
	    
	    RequestDispatcher dispatcher =
	      request.getRequestDispatcher(address);
	    dispatcher.forward(request, response);
	}
		/*
		 * PrintWriter out = response.getWriter();
		 * 
		 * String title = "Using GET Method to Read Form Data";
		 * 
		 * out.println("<html>\n" + "<head><title>" + title +
		 * "</title></head>\n" + "<body>\n" + "<h1 align=\"center\">" + title +
		 * "</h1>\n" + "<ul>\n" + "  <li><b>Email</b>: " +
		 * request.getParameter("email") + "\n" + "  <li><b>Password</b>: " +
		 * request.getParameter("password") + "\n" + "</ul>\n" +
		 * "</body></html>");
		 */
		/*
		 * RegisterDetails details = new RegisterDetails();
		 * details.setName(request.getParameter("FullName"));
		 * details.setEmail(request.getParameter("EmailAddress"));
		 * details.setPassword(request.getParameter("Password"));
		 * details.setUsername(request.getParameter("Username"));
		 * request.setAttribute("details", details);
		 * getServletContext().getRequestDispatcher
		 * ("/WEB-INF/Error.jsp").forward(request, response);
		 */
		
		/*
		 * ValueObject value = new ValueObject(...);
		 * 
		 * HttpSession session = request.getSession();
		 * session.setAttribute("key", value); 
		 * RequestDispatcher dispatcher =
		 * request.getRequestDispatcher ("/WEB-INF/SomePage.jsp");
		 * dispatcher.forward(request, response);
		 */
	    
	    /*
		Customer user = new Customer();

		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));

		// Some DB Processing; get fullname from db
		user.setFullname("Namyun Kim");

		request.setAttribute("user", user);
		//HttpSession session = request.getSession();
		//session.setAttribute("user", user); 

		if (!user.validate()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher ("/error.jsp");
			dispatcher.forward(request, response);
			//getServletContext().getRequestDispatcher("/error.jsp").forward(
					//request, response);
		} else {

			RequestDispatcher dispatcher = request.getRequestDispatcher("/loginsuccess.jsp");

			dispatcher.forward(request, response);
			//getServletContext().getRequestDispatcher("/loginsuccess.jsp")
				//	.forward(request, response);
		} */
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
