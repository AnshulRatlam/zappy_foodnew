package customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao_Customer;

/**
 * Servlet implementation class checkotpservlet
 */
@WebServlet("/checkotpservlet")
public class checkotpservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkotpservlet() {
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
		// TODO Auto-generated method stub
		String otp=request.getParameter("otp");
		String pass=request.getParameter("new_pass");
		PrintWriter out = response.getWriter();
		Dao_Customer m = new Dao_Customer(); 
		String print = m.checkuserotp(otp);
		
		if(print!=null)
		{
			m.updatepassword(print,pass);
			
			RequestDispatcher rd=request.getRequestDispatcher("enterotp.jsp");
		      request.setAttribute("msg", "your password Change");
		      
		      rd.forward(request, response);
		}
		else
		{
			out.println("you enter wrong otp");
		}
		
	}

}
