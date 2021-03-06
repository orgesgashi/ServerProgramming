package login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	    public UserLoginServlet() {
	        super();
	    }
	 
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	         
	        UsersDao userDao = new UsersDao();
	         
	        try {
	            Users user = userDao.checkLogin(email, password);
	            String destPage = "login.jsp";
	             
	            if (user != null) {
	                HttpSession session = request.getSession();
	                session.setAttribute("User", user);
	                destPage = "index.html";
	                
	                
	            } else {
	                String message = "Invalid email or password";
	                request.setAttribute("message", message);
	            }
	             
	            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
	            dispatcher.forward(request, response);
	             
	        } catch (SQLException | ClassNotFoundException ex) {
	            throw new ServletException(ex);
	        }
	    }
	}
